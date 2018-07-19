package com.citibanamex.customer.information.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.citibanamex.customer.information.models.ResponseOpenLegacy;

@FeignClient("name-open-legacy")
public interface ProxyLegacyMessage {

	@RequestMapping(method=RequestMethod.POST, value="/get/information/legacymessage", consumes="application/json")
	ResponseOpenLegacy getOpenLegacy();

}
