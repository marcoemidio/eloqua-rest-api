
package com.oracle.eloqua.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "contentSource"
})

public class HtmlContent {

    @JsonProperty("type")
    private String type;
    @JsonProperty("contentSource")
    private String contentSource;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("contentSource")
    public String getContentSource() {
        return contentSource;
    }

    @JsonProperty("contentSource")
    public void setContentSource(String contentSource) {
        this.contentSource = contentSource;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("contentSource", contentSource).toString();
    }

}
