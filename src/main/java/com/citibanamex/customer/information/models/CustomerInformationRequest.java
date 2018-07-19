package com.citibanamex.customer.information.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomerInformationRequest
 */

public class CustomerInformationRequest implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1577321761938460516L;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("productCode")
  private String productCode = null;

  @JsonProperty("productInstrument")
  private String productInstrument = null;

  @JsonProperty("acountNumber")
  private String acountNumber = null;

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getProductInstrument() {
    return productInstrument;
  }

  public void setProductInstrument(String productInstrument) {
    this.productInstrument = productInstrument;
  }

  public String getAcountNumber() {
    return acountNumber;
  }

  public void setAcountNumber(String acountNumber) {
    this.acountNumber = acountNumber;
  }

}