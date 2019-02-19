package com.oracle.eloqua.beans;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "name",
    "contactIds",
    "email",
    /*"sendFromUserId",
    "signatureRuleId",
    "notificationEmailAddress",
    "sendDate",*/
    "sendOptions"
})
public class EmailLowVolumeDeployment {
	
	@JsonProperty("type")
	private String type;
	@JsonProperty("name")
	private String name;
	@JsonProperty("contactIds")
	private List<String> contactIds;
	@JsonProperty("email")
	private Email email;
	@JsonProperty("sendFromUserId")
	private String sendFromUserId;
	@JsonProperty("signatureRuleId")
	private String signatureRuleId;
	@JsonProperty("notificationEmailAddress")
	private String notificationEmailAddress;
	@JsonProperty("sendDate")
	private String sendDate;
	@JsonProperty("sendOptions")
	private SendOptions sendOptions;
	
	/*public EmailLowVolumeDeployment(String type, String name, List<String> contactIds, Email email, SendOptions sendOptions) {
		this.type = type;
		this.name = name;
		this.contactIds = contactIds;
		this.email = email;
		this.sendOptions = sendOptions;
	}*/
	
	@JsonProperty("type")
	public String getType() {
		return type;
	}
	
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonProperty("contactIds")
	public List<String> getContactIds() {
		return contactIds;
	}
	
	@JsonProperty("contactIds")
	public void setContactIds(List<String> contactIds) {
		this.contactIds = contactIds;
	}
	
	@JsonProperty("email")		
	public Email getEmail() {
		return email;
	}
	
	@JsonProperty("email")	
	public void setEmail(Email email) {
		this.email = email;
	}
	
	@JsonProperty("sendFromUserId")	
	public String getSendFromUserId() {
		return sendFromUserId;
	}
	
	@JsonProperty("sendFromUserId")
	public void setSendFromUserId(String sendFromUserId) {
		this.sendFromUserId = sendFromUserId;
	}
	
	@JsonProperty("signatureRuleId")	
	public String getSignatureRuleId() {
		return signatureRuleId;
	}
	
	@JsonProperty("signatureRuleId")	
	public void setSignatureRuleId(String signatureRuleId) {
		this.signatureRuleId = signatureRuleId;
	}
	
	@JsonProperty("notificationEmailAddress")	
	public String getNotificationEmailAddress() {
		return notificationEmailAddress;
	}
	
	@JsonProperty("notificationEmailAddress")	
	public void setNotificationEmailAddress(String notificationEmailAddress) {
		this.notificationEmailAddress = notificationEmailAddress;
	}
	
	@JsonProperty("sendDate")	
	public String getSendDate() {
		return sendDate;
	}
	
	@JsonProperty("sendDate")	
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	
	
	
	@JsonProperty("sendOptions")	
	public SendOptions getSendOptions() {
		return sendOptions;
	}
	
	@JsonProperty("sendOptions")	
	public void setSendOptions(SendOptions sendOptions) {
		this.sendOptions = sendOptions;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type)
        		.append("name", name)
        		.append("contactIds", contactIds)
        		.append("email", email)
        		.append("sendFromUserId", sendFromUserId)
        		.append("signatureRuleId", signatureRuleId)
        		.append("notificationEmailAddress", notificationEmailAddress)
        		.append("sendDate", sendDate)
        		.append("sendOptions", sendOptions)
        		.toString();
    }
}
