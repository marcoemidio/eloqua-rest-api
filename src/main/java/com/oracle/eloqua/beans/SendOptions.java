package com.oracle.eloqua.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allowResend",
    "allowSendToMasterExclude",
    "allowSendToUnsubscribe",
    "allowSendToGroupUnsubscribe",
    "allowSendToBounceback"
})
public class SendOptions{
	
	@JsonProperty("allowResend")
	private String allowResend;
	@JsonProperty("allowSendToMasterExclude")
    private String allowSendToMasterExclude;
	@JsonProperty("allowSendToUnsubscribe")
    private String allowSendToUnsubscribe;
	@JsonProperty("allowSendToGroupUnsubscribe")
    private String allowSendToGroupUnsubscribe;
	@JsonProperty("allowSendToBounceback")
    private String allowSendToBounceback;
    
    @JsonProperty("allowResend")
    public String getAllowResend() {
        return allowResend;
    }
    
    @JsonProperty("allowResend")
    public void setAllowResend(String allowResend) {
        this.allowResend = allowResend;
    }
    
    @JsonProperty("allowSendToMasterExclude")
    public String getAllowSendToMasterExclude() {
        return allowSendToMasterExclude;
    }
    
    @JsonProperty("allowSendToMasterExclude")
    public void setAllowSendToMasterExclude(String allowSendToMasterExclude) {
        this.allowSendToMasterExclude = allowSendToMasterExclude;
    }
    
    @JsonProperty("allowSendToUnsubscribe")
    public String getAllowSendToUnsubscribe() {
        return allowSendToUnsubscribe;
    }
    
    @JsonProperty("allowSendToUnsubscribe")
    public void setAllowSendToUnsubscribe(String allowSendToUnsubscribe) {
        this.allowSendToUnsubscribe = allowSendToUnsubscribe;
    }
    
    @JsonProperty("allowSendToGroupUnsubscribe")
    public String getAllowSendToGroupUnsubscribe() {
        return allowSendToGroupUnsubscribe;
    }
    
    @JsonProperty("allowSendToGroupUnsubscribe")
    public void setAllowSendToGroupUnsubscribe(String allowSendToGroupUnsubscribe) {
        this.allowSendToGroupUnsubscribe = allowSendToGroupUnsubscribe;
    }
    
    @JsonProperty("allowSendToBounceback")
    public String getAllowSendToBounceback() {
        return allowSendToBounceback;
    }
    
    @JsonProperty("allowSendToBounceback")
    public void setAllowSendToBounceback(String allowSendToBounceback) {
        this.allowSendToBounceback = allowSendToBounceback;
    }
	
	@Override
    public String toString() {
        return "sendOptions{" +
                "allowResend=" + allowResend +
                ", allowSendToUnsubscribe='" + allowSendToUnsubscribe + '\'' +
                '}';
    }

}
