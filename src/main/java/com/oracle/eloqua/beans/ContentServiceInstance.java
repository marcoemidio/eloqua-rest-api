
package com.oracle.eloqua.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "componentId",
    "configurationUrl",
    "configurationUrlModalSize",
    "editorImageUrl",
    "height",
    "width",
    "enabledConfigStatus",
    "appStatus",
    "requiresConfiguration"
})
public class ContentServiceInstance {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("componentId")
    private String componentId;
    @JsonProperty("configurationUrl")
    private String configurationUrl;
    @JsonProperty("configurationUrlModalSize")
    private String configurationUrlModalSize;
    @JsonProperty("editorImageUrl")
    private String editorImageUrl;
    @JsonProperty("height")
    private Height height;
    @JsonProperty("width")
    private Width width;
    @JsonProperty("enabledConfigStatus")
    private String enabledConfigStatus;
    @JsonProperty("appStatus")
    private String appStatus;
    @JsonProperty("requiresConfiguration")
    private String requiresConfiguration;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }

    @JsonProperty("componentId")
    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    @JsonProperty("configurationUrl")
    public String getConfigurationUrl() {
        return configurationUrl;
    }

    @JsonProperty("configurationUrl")
    public void setConfigurationUrl(String configurationUrl) {
        this.configurationUrl = configurationUrl;
    }

    @JsonProperty("configurationUrlModalSize")
    public String getConfigurationUrlModalSize() {
        return configurationUrlModalSize;
    }

    @JsonProperty("configurationUrlModalSize")
    public void setConfigurationUrlModalSize(String configurationUrlModalSize) {
        this.configurationUrlModalSize = configurationUrlModalSize;
    }

    @JsonProperty("editorImageUrl")
    public String getEditorImageUrl() {
        return editorImageUrl;
    }

    @JsonProperty("editorImageUrl")
    public void setEditorImageUrl(String editorImageUrl) {
        this.editorImageUrl = editorImageUrl;
    }

    @JsonProperty("height")
    public Height getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Height height) {
        this.height = height;
    }

    @JsonProperty("width")
    public Width getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Width width) {
        this.width = width;
    }

    @JsonProperty("enabledConfigStatus")
    public String getEnabledConfigStatus() {
        return enabledConfigStatus;
    }

    @JsonProperty("enabledConfigStatus")
    public void setEnabledConfigStatus(String enabledConfigStatus) {
        this.enabledConfigStatus = enabledConfigStatus;
    }

    @JsonProperty("appStatus")
    public String getAppStatus() {
        return appStatus;
    }

    @JsonProperty("appStatus")
    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    @JsonProperty("requiresConfiguration")
    public String getRequiresConfiguration() {
        return requiresConfiguration;
    }

    @JsonProperty("requiresConfiguration")
    public void setRequiresConfiguration(String requiresConfiguration) {
        this.requiresConfiguration = requiresConfiguration;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("componentId", componentId).append("configurationUrl", configurationUrl).append("configurationUrlModalSize", configurationUrlModalSize).append("editorImageUrl", editorImageUrl).append("height", height).append("width", width).append("enabledConfigStatus", enabledConfigStatus).append("appStatus", appStatus).append("requiresConfiguration", requiresConfiguration).toString();
    }

}
