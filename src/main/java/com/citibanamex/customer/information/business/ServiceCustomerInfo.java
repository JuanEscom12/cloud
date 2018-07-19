package com.citibanamex.customer.information.business;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateContext;
import org.springframework.stereotype.Service;

import com.citibanamex.customer.information.models.CustomerInformationRequest;
import com.citibanamex.customer.information.models.CustomerInformationResponse;
import com.citibanamex.customer.information.models.ResponseMasterHub;
import com.citibanamex.customer.information.models.ResponseOpenLegacy;
import com.citibanamex.customer.information.proxy.ProxyLegacyMessage;
import com.citibanamex.customer.information.proxy.ProxyMasterHub;
import com.citibanamex.customer.information.statemachine.EventsCustomerInfo;
import com.citibanamex.customer.information.statemachine.StatesCustomerInfo;
import com.citibanamex.customer.information.topic.KafkaProducer;
import com.citibanamex.customer.information.util.Constants;

@Service
public class ServiceCustomerInfo {

	/**
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 */
	@Autowired
	private ProxyMasterHub proxyMasterHub;
	
	/**
	 */
	@Autowired
	private ProxyLegacyMessage proxyLegacyMessage;
	
	/**
	 */
	@Autowired
	private KafkaProducer producer;
 
	/**
	 * 
	 * @param context
	 */
	public void validateRequest(final StateContext<StatesCustomerInfo, EventsCustomerInfo> context) {
    	final CustomerInformationRequest request = (CustomerInformationRequest) context.getMessage().getHeaders().get(Constants.REQUEST_KEY);
    	System.out.println(":: State Validation" + request);
    	// Execute validator
    	final boolean isValid = Boolean.TRUE;
    	if(isValid) {
    		context.getStateMachine().sendEvent(EventsCustomerInfo.CONSULT);
    	} else {
    		//Throw Error
    	}
	}
	
	/**
	 * 
	 * @return
	 */
	public void consultMasterHub(final StateContext<StatesCustomerInfo, EventsCustomerInfo> context) {
		//Generate Request
		final CustomerInformationRequest request = (CustomerInformationRequest) context.getMessage().getHeaders().get(Constants.REQUEST_KEY);
		//Consult Master-Hub
		final ResponseMasterHub resultMasterHub = proxyMasterHub.getMasterHubData();
		//Generate Response
		final CustomerInformationResponse result = new CustomerInformationResponse();
		// Next state
		final Message<EventsCustomerInfo> message = MessageBuilder
				.withPayload(EventsCustomerInfo.RESPONSE)
				.setHeader(Constants.RESPONSE_KEY, result)
				.build();
		context.getStateMachine().sendEvent(message);
	}
	
	/**
	 * 
	 * @param context
	 */
	public void consultOpenLegacy(final StateContext<StatesCustomerInfo, EventsCustomerInfo> context) {
		logger.info("::: CONSULT LEGACY MESSAGE ");
		//Create Request
		final CustomerInformationRequest request = (CustomerInformationRequest) context.getMessage().getHeaders().get(Constants.REQUEST_KEY);
		//Execute Legacy Message
		final ResponseOpenLegacy resultLegacyMessage = proxyLegacyMessage.getOpenLegacy();
		//Generate response
		final CustomerInformationResponse result = new CustomerInformationResponse();
		// Next state
		final Message<EventsCustomerInfo> message = MessageBuilder
				.withPayload(EventsCustomerInfo.KAFKA)
				.setHeader(Constants.RESPONSE_KEY, result)
				.build();
		context.getStateMachine().sendEvent(message);
	}
	
	/**
	 * 
	 * @param context
	 */
	public void putMessageKafkaMasterHub(final StateContext<StatesCustomerInfo, EventsCustomerInfo> context) {
		//Generate Message
		final CustomerInformationResponse result = (CustomerInformationResponse) context.getMessage().getHeaders().get(Constants.RESPONSE_KEY);
		final String message = "";
		//Put message kafka topic
		producer.send(message);
	}
	
	
}
