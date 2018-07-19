package com.citibanamex.customer.information.web;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.citibanamex.customer.information.models.CustomerDataInformation;

import reactor.core.publisher.Mono;

public class GreetingWebClient {
  private WebClient client = WebClient.create("http://localhost:8020");

  private Mono<ClientResponse> result = client.get().uri("/v1/customers/profile/information")
      .accept(MediaType.APPLICATION_JSON).exchange();

  public String getResult() {
    return ">> result = "
        + result.flatMap(res -> res.bodyToMono(CustomerDataInformation.class)).block();
  }
}