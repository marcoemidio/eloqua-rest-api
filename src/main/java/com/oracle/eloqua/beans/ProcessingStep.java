
package com.oracle.eloqua.beans;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "currentStatus",
    "name",
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
    "execute",
    "condition",
    "description",
    "hasValidationIssue"
})
public class ProcessingStep {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("currentStatus")
    private String currentStatus;
    @JsonProperty("name")
    private String name;
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
    @JsonProperty("execute")
    private String execute;
    @JsonProperty("condition")
    private Condition condition;
    @JsonProperty("description")
    private String description;
    @JsonProperty("hasValidationIssue")
    private String hasValidationIssue;

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

    @JsonProperty("execute")
    public String getExecute() {
        return execute;
    }

    @JsonProperty("execute")
    public void setExecute(String execute) {
        this.execute = execute;
    }

    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("hasValidationIssue")
    public String getHasValidationIssue() {
        return hasValidationIssue;
    }

    @JsonProperty("hasValidationIssue")
    public void setHasValidationIssue(String hasValidationIssue) {
        this.hasValidationIssue = hasValidationIssue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("currentStatus", currentStatus).append("name", name).append("permissions", permissions).append("folderId", folderId).append("sourceTemplateId", sourceTemplateId).append("createdBy", createdBy).append("createdAt", createdAt).append("updatedBy", updatedBy).append("updatedAt", updatedAt).append("accessedAt", accessedAt).append("scheduledFor", scheduledFor).append("depth", depth).append("execute", execute).append("condition", condition).append("description", description).append("hasValidationIssue", hasValidationIssue).toString();
    }

}
