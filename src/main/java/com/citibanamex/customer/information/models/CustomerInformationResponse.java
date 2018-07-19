package com.citibanamex.customer.information.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * CustomerInformationResponse
 */

public class CustomerInformationResponse implements Serializable {
	
  /**
   * 
   */
  private static final long serialVersionUID = 1097266303866354586L;
  @JsonProperty("customer")
  private CustomerDataInformation customer = null;

  public CustomerDataInformation getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerDataInformation customer) {
    this.customer = customer;
  }

}