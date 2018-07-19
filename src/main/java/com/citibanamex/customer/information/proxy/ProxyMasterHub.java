package com.citibanamex.customer.information.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.citibanamex.customer.information.models.ResponseMasterHub;

@FeignClient("name-masterhub-app")
public interface ProxyMasterHub {
	
	@RequestMapping(method=RequestMethod.POST, value="/get/information", consumes="application/json")
	ResponseMasterHub getMasterHubData();

}
