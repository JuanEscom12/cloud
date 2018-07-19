package com.citibanamex.customer.information.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.citibanamex.customer.information.models.CustomerDataInformation;
import com.citibanamex.customer.information.models.CustomerInformationRequest;
import com.citibanamex.customer.information.statemachine.EventsCustomerInfo;
import com.citibanamex.customer.information.statemachine.StatesCustomerInfo;
import com.citibanamex.customer.information.util.Constants;

import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {

	/**
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 */
	@Autowired
	private StateMachine<StatesCustomerInfo, EventsCustomerInfo> stateMachine;

	public Mono<ServerResponse> handlerCustomerInformation(final ServerRequest request) {
		
		logger.info(":: HANDLER");
		
		final CustomerInformationRequest customerInformationRequest = new CustomerInformationRequest();
		
		final Message<EventsCustomerInfo> message = MessageBuilder
				.withPayload(EventsCustomerInfo.VALIDATE)
				.setHeader(Constants.REQUEST_KEY, customerInformationRequest)
				.build();

		stateMachine.sendEvent(message);
		
		CustomerDataInformation result = null;
		while(!stateMachine.isComplete()) {
			result = (CustomerDataInformation) message.getHeaders().get(Constants.RESPONSE_KEY);
		}
		
		logger.info(":: RESULT HANDLER " + result);
		
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(result), CustomerDataInformation.class);
	}
}