
package com.oracle.eloqua.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "currentStatus",
    "name",
    "description",
    "permissions",
    "folderId",
    "sourceTemplateId",
    "createdBy",
    "createdAt",
    "updatedBy",
    "updatedAt",
    "accessedAt",
    "scheduledFor",
    "depth",
    "syntax",
    "defaultValue",
    "contactFieldId",
    "accountFieldId",
    "eventId",
    "eventFieldId",
    "eventSessionFieldId",
    "customObjectId",
    "customObjectFieldId",
    "mergeType",
    "customObjectSort",
    "queryStringKey",
    "fieldConditions",
    "allowUrlsInValue"
})
public class FieldMerge {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("currentStatus")
    private String currentStatus;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("permissions")
    private List<String> permissions = null;
    @JsonProperty("folderId")
    private String folderId;
    @JsonProperty("sourceTemplateId")
    private String sourceTemplateId;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("updatedBy")
    private String updatedBy;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("accessedAt")
    private String accessedAt;
    @JsonProperty("scheduledFor")
    private String scheduledFor;
    @JsonProperty("depth")
    private String depth;
    @JsonProperty("syntax")
    private String syntax;
    @JsonProperty("defaultValue")
    private String defaultValue;
    @JsonProperty("contactFieldId")
    private String contactFieldId;
    @JsonProperty("accountFieldId")
    private String accountFieldId;
    @JsonProperty("eventId")
    private String eventId;
    @JsonProperty("eventFieldId")
    private String eventFieldId;
    @JsonProperty("eventSessionFieldId")
    private String eventSessionFieldId;
    @JsonProperty("customObjectId")
    private String customObjectId;
    @JsonProperty("customObjectFieldId")
    private String customObjectFieldId;
    @JsonProperty("mergeType")
    private String mergeType;
    @JsonProperty("customObjectSort")
    private String customObjectSort;
    @JsonProperty("queryStringKey")
    private String queryStringKey;
    @JsonProperty("fieldConditions")
    private List<FieldCondition> fieldConditions = null;
    @JsonProperty("allowUrlsInValue")
    private String allowUrlsInValue;

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

    @JsonProperty("currentStatus")
    public String getCurrentStatus() {
        return currentStatus;
    }

    @JsonProperty("currentStatus")
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("permissions")
    public List<String> getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("folderId")
    public String getFolderId() {
        return folderId;
    }

    @JsonProperty("folderId")
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    @JsonProperty("sourceTemplateId")
    public String getSourceTemplateId() {
        return sourceTemplateId;
    }

    @JsonProperty("sourceTemplateId")
    public void setSourceTemplateId(String sourceTemplateId) {
        this.sourceTemplateId = sourceTemplateId;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("accessedAt")
    public String getAccessedAt() {
        return accessedAt;
    }

    @JsonProperty("accessedAt")
    public void setAccessedAt(String accessedAt) {
        this.accessedAt = accessedAt;
    }

    @JsonProperty("scheduledFor")
    public String getScheduledFor() {
        return scheduledFor;
    }

    @JsonProperty("scheduledFor")
    public void setScheduledFor(String scheduledFor) {
        this.scheduledFor = scheduledFor;
    }

    @JsonProperty("depth")
    public String getDepth() {
        return depth;
    }

    @JsonProperty("depth")
    public void setDepth(String depth) {
        this.depth = depth;
    }

    @JsonProperty("syntax")
    public String getSyntax() {
        return syntax;
    }

    @JsonProperty("syntax")
    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    @JsonProperty("defaultValue")
    public String getDefaultValue() {
        return defaultValue;
    }

    @JsonProperty("defaultValue")
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @JsonProperty("contactFieldId")
    public String getContactFieldId() {
        return contactFieldId;
    }

    @JsonProperty("contactFieldId")
    public void setContactFieldId(String contactFieldId) {
        this.contactFieldId = contactFieldId;
    }

    @JsonProperty("accountFieldId")
    public String getAccountFieldId() {
        return accountFieldId;
    }

    @JsonProperty("accountFieldId")
    public void setAccountFieldId(String accountFieldId) {
        this.accountFieldId = accountFieldId;
    }

    @JsonProperty("eventId")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("eventId")
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("eventFieldId")
    public String getEventFieldId() {
        return eventFieldId;
    }

    @JsonProperty("eventFieldId")
    public void setEventFieldId(String eventFieldId) {
        this.eventFieldId = eventFieldId;
    }

    @JsonProperty("eventSessionFieldId")
    public String getEventSessionFieldId() {
        return eventSessionFieldId;
    }

    @JsonProperty("eventSessionFieldId")
    public void setEventSessionFieldId(String eventSessionFieldId) {
        this.eventSessionFieldId = eventSessionFieldId;
    }

    @JsonProperty("customObjectId")
    public String getCustomObjectId() {
        return customObjectId;
    }

    @JsonProperty("customObjectId")
    public void setCustomObjectId(String customObjectId) {
        this.customObjectId = customObjectId;
    }

    @JsonProperty("customObjectFieldId")
    public String getCustomObjectFieldId() {
        return customObjectFieldId;
    }

    @JsonProperty("customObjectFieldId")
    public void setCustomObjectFieldId(String customObjectFieldId) {
        this.customObjectFieldId = customObjectFieldId;
    }

    @JsonProperty("mergeType")
    public String getMergeType() {
        return mergeType;
    }

    @JsonProperty("mergeType")
    public void setMergeType(String mergeType) {
        this.mergeType = mergeType;
    }

    @JsonProperty("customObjectSort")
    public String getCustomObjectSort() {
        return customObjectSort;
    }

    @JsonProperty("customObjectSort")
    public void setCustomObjectSort(String customObjectSort) {
        this.customObjectSort = customObjectSort;
    }

    @JsonProperty("queryStringKey")
    public String getQueryStringKey() {
        return queryStringKey;
    }

    @JsonProperty("queryStringKey")
    public void setQueryStringKey(String queryStringKey) {
        this.queryStringKey = queryStringKey;
    }

    @JsonProperty("fieldConditions")
    public List<FieldCondition> getFieldConditions() {
        return fieldConditions;
    }

    @JsonProperty("fieldConditions")
    public void setFieldConditions(List<FieldCondition> fieldConditions) {
        this.fieldConditions = fieldConditions;
    }

    @JsonProperty("allowUrlsInValue")
    public String getAllowUrlsInValue() {
        return allowUrlsInValue;
    }

    @JsonProperty("allowUrlsInValue")
    public void setAllowUrlsInValue(String allowUrlsInValue) {
        this.allowUrlsInValue = allowUrlsInValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("currentStatus", currentStatus).append("name", name).append("description", description).append("permissions", permissions).append("folderId", folderId).append("sourceTemplateId", sourceTemplateId).append("createdBy", createdBy).append("createdAt", createdAt).append("updatedBy", updatedBy).append("updatedAt", updatedAt).append("accessedAt", accessedAt).append("scheduledFor", scheduledFor).append("depth", depth).append("syntax", syntax).append("defaultValue", defaultValue).append("contactFieldId", contactFieldId).append("accountFieldId", accountFieldId).append("eventId", eventId).append("eventFieldId", eventFieldId).append("eventSessionFieldId", eventSessionFieldId).append("customObjectId", customObjectId).append("customObjectFieldId", customObjectFieldId).append("mergeType", mergeType).append("customObjectSort", customObjectSort).append("queryStringKey", queryStringKey).append("fieldConditions", fieldConditions).append("allowUrlsInValue", allowUrlsInValue).toString();
    }

}
