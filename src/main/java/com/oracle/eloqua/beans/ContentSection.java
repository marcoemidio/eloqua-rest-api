
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
    "contentHtml",
    "contentText",
    "scope",
    "forms",
    "images",
    "hyperlinks",
    "files",
    "size"
})
public class ContentSection {

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
    @JsonProperty("contentHtml")
    private String contentHtml;
    @JsonProperty("contentText")
    private String contentText;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("forms")
    private List<Form> forms = null;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("hyperlinks")
    private List<Hyperlink> hyperlinks = null;
    @JsonProperty("files")
    private List<File> files = null;
    @JsonProperty("size")
    private Size size;

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

    @JsonProperty("contentHtml")
    public String getContentHtml() {
        return contentHtml;
    }

    @JsonProperty("contentHtml")
    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
    }

    @JsonProperty("contentText")
    public String getContentText() {
        return contentText;
    }

    @JsonProperty("contentText")
    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("forms")
    public List<Form> getForms() {
        return forms;
    }

    @JsonProperty("forms")
    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("hyperlinks")
    public List<Hyperlink> getHyperlinks() {
        return hyperlinks;
    }

    @JsonProperty("hyperlinks")
    public void setHyperlinks(List<Hyperlink> hyperlinks) {
        this.hyperlinks = hyperlinks;
    }

    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<File> files) {
        this.files = files;
    }

    @JsonProperty("size")
    public Size getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("currentStatus", currentStatus).append("name", name).append("description", description).append("permissions", permissions).append("folderId", folderId).append("sourceTemplateId", sourceTemplateId).append("createdBy", createdBy).append("createdAt", createdAt).append("updatedBy", updatedBy).append("updatedAt", updatedAt).append("accessedAt", accessedAt).append("scheduledFor", scheduledFor).append("depth", depth).append("contentHtml", contentHtml).append("contentText", contentText).append("scope", scope).append("forms", forms).append("images", images).append("hyperlinks", hyperlinks).append("files", files).append("size", size).toString();
    }

}
