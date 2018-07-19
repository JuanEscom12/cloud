package com.citibanamex.customer.information.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDataInformation  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5558391161749323280L;

	
	 @JsonProperty("customerId")
	  private String customerId = null;

	  @JsonProperty("registeredAddressCount")
	  private Integer registeredAddressCount = null;

	  @JsonProperty("fullName")
	  private String fullName = null;

	  @JsonProperty("customerType")
	  private String customerType = null;

	  @JsonProperty("economicActivityCode")
	  private String economicActivityCode = null;

	  @JsonProperty("economicActivityBanxicoCode")
	  private String economicActivityBanxicoCode = null;

	  @JsonProperty("economicSector")
	  private String economicSector = null;

	  @JsonProperty("customerSegment")
	  private String customerSegment = null;

	  @JsonProperty("billingCycleDay")
	  private Integer billingCycleDay = null;

	  @JsonProperty("preferredBranchId")
	  private String preferredBranchId = null;

	  @JsonProperty("customerStatus")
	  private String customerStatus = null;

	  @JsonProperty("dataCenterLocation")
	  private String dataCenterLocation = null;

	  @JsonProperty("customerSinceDate")
	  private String customerSinceDate = null;

	  @JsonProperty("lastUpdateDate")
	  private String lastUpdateDate = null;

	  @JsonProperty("riskLevelCode")
	  private String riskLevelCode = null;

	  @JsonProperty("banxicoRiskLevelCode")
	  private String banxicoRiskLevelCode = null;

	  @JsonProperty("sendAdvertisingFlag")
	  private Boolean sendAdvertisingFlag = null;

	  @JsonProperty("customerOwnershipType")
	  private String customerOwnershipType = null;

	  @JsonProperty("customerRating")
	  private String customerRating = null;

	  @JsonProperty("mailingAddressId")
	  private String mailingAddressId = null;

	  @JsonProperty("offerProductType")
	  private String offerProductType = null;

	  @JsonProperty("consolidateStatementIndicator")
	  private String consolidateStatementIndicator = null;

//	  @JsonProperty("phone")
//	  private PhoneInformation phone = null;

//	  @JsonProperty("address")
//	  private AddressInformation address = null;
//
//	  @JsonProperty("taxProfile")
//	  private TaxProfileInformation taxProfile = null;
//
//	  @JsonProperty("demographics")
//	  private DemographicsInformation demographics = null;
//
//	  @JsonProperty("employment")
//	  private EmploymentInformation employment = null;

	  public String getCustomerId() {
	    return customerId;
	  }

	  public void setCustomerId(String customerId) {
	    this.customerId = customerId;
	  }

	  public Integer getRegisteredAddressCount() {
	    return registeredAddressCount;
	  }

	  public void setRegisteredAddressCount(Integer registeredAddressCount) {
	    this.registeredAddressCount = registeredAddressCount;
	  }

	  public String getFullName() {
	    return fullName;
	  }

	  public void setFullName(String fullName) {
	    this.fullName = fullName;
	  }

	  public String getCustomerType() {
	    return customerType;
	  }

	  public void setCustomerType(String customerType) {
	    this.customerType = customerType;
	  }

	  public String getEconomicActivityCode() {
	    return economicActivityCode;
	  }

	  public void setEconomicActivityCode(String economicActivityCode) {
	    this.economicActivityCode = economicActivityCode;
	  }

	  public String getEconomicActivityBanxicoCode() {
	    return economicActivityBanxicoCode;
	  }

	  public void setEconomicActivityBanxicoCode(String economicActivityBanxicoCode) {
	    this.economicActivityBanxicoCode = economicActivityBanxicoCode;
	  }

	  public String getEconomicSector() {
	    return economicSector;
	  }

	  public void setEconomicSector(String economicSector) {
	    this.economicSector = economicSector;
	  }

	  public String getCustomerSegment() {
	    return customerSegment;
	  }

	  public void setCustomerSegment(String customerSegment) {
	    this.customerSegment = customerSegment;
	  }

	  public Integer getBillingCycleDay() {
	    return billingCycleDay;
	  }

	  public void setBillingCycleDay(Integer billingCycleDay) {
	    this.billingCycleDay = billingCycleDay;
	  }

	  public String getPreferredBranchId() {
	    return preferredBranchId;
	  }

	  public void setPreferredBranchId(String preferredBranchId) {
	    this.preferredBranchId = preferredBranchId;
	  }

	  public String getCustomerStatus() {
	    return customerStatus;
	  }

	  public void setCustomerStatus(String customerStatus) {
	    this.customerStatus = customerStatus;
	  }

	  public String getDataCenterLocation() {
	    return dataCenterLocation;
	  }

	  public void setDataCenterLocation(String dataCenterLocation) {
	    this.dataCenterLocation = dataCenterLocation;
	  }

	  public String getCustomerSinceDate() {
	    return customerSinceDate;
	  }

	  public void setCustomerSinceDate(String customerSinceDate) {
	    this.customerSinceDate = customerSinceDate;
	  }

	  public String getLastUpdateDate() {
	    return lastUpdateDate;
	  }

	  public void setLastUpdateDate(String lastUpdateDate) {
	    this.lastUpdateDate = lastUpdateDate;
	  }

	  public String getRiskLevelCode() {
	    return riskLevelCode;
	  }

	  public void setRiskLevelCode(String riskLevelCode) {
	    this.riskLevelCode = riskLevelCode;
	  }

	  public String getBanxicoRiskLevelCode() {
	    return banxicoRiskLevelCode;
	  }

	  public void setBanxicoRiskLevelCode(String banxicoRiskLevelCode) {
	    this.banxicoRiskLevelCode = banxicoRiskLevelCode;
	  }

	  public Boolean getSendAdvertisingFlag() {
	    return sendAdvertisingFlag;
	  }

	  public void setSendAdvertisingFlag(Boolean sendAdvertisingFlag) {
	    this.sendAdvertisingFlag = sendAdvertisingFlag;
	  }

	  public String getCustomerOwnershipType() {
	    return customerOwnershipType;
	  }

	  public void setCustomerOwnershipType(String customerOwnershipType) {
	    this.customerOwnershipType = customerOwnershipType;
	  }

	  public String getCustomerRating() {
	    return customerRating;
	  }

	  public void setCustomerRating(String customerRating) {
	    this.customerRating = customerRating;
	  }

	  public String getMailingAddressId() {
	    return mailingAddressId;
	  }

	  public void setMailingAddressId(String mailingAddressId) {
	    this.mailingAddressId = mailingAddressId;
	  }

	  public String getOfferProductType() {
	    return offerProductType;
	  }

	  public void setOfferProductType(String offerProductType) {
	    this.offerProductType = offerProductType;
	  }

	  public String getConsolidateStatementIndicator() {
	    return consolidateStatementIndicator;
	  }

	  public void setConsolidateStatementIndicator(String consolidateStatementIndicator) {
	    this.consolidateStatementIndicator = consolidateStatementIndicator;
	  }


}
