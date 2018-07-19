package com.citibanamex.customer.information.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.citibanamex.customer.information.web.GreetingWebClient;

import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {

	@Bean
	public MeterRegistryCustomizer<MeterRegistry> commonTags() {
		return (registry) -> registry.config()
				.commonTags("application", "CustomerInformation");
	}

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(":: " + gwc.getResult());
	}
}
