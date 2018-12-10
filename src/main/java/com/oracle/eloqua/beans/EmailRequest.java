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
    "subject",
    "previewText",
    "senderName",
    "senderEmail",
    "replyToName",
    "replyToEmail",
    "bounceBackEmail",
    "virtualMTAId",
    "htmlContent",
    "plainText",
    "isPlainTextEditable",
    "sendPlainTextOnly",
    "isTracked",
    "isPrivate",
    "layout",
    "style",
    "forms",
    "images",
    "hyperlinks",
    "contentSections",
    "dynamicContents",
    "files",
    "contentServiceInstances",
    "emailHeaderId",
    "emailFooterId",
    "emailGroupId",
    "encodingId",
    "fieldMerges",
    "attachments",
    "isContentProtected",
    "renderMode",
    "archive"
})
public class EmailRequest{
	
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
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("previewText")
    private String previewText;
    @JsonProperty("senderName")
    private String senderName;
    @JsonProperty("senderEmail")
    private String senderEmail;
    @JsonProperty("replyToName")
    private String replyToName;
    @JsonProperty("replyToEmail")
    private String replyToEmail;
    @JsonProperty("bounceBackEmail")
    private String bounceBackEmail;
    @JsonProperty("virtualMTAId")
    private String virtualMTAId;
    @JsonProperty("htmlContent")
    private HtmlContent htmlContent;
    @JsonProperty("plainText")
    private String plainText;
    @JsonProperty("isPlainTextEditable")
    private String isPlainTextEditable;
    @JsonProperty("sendPlainTextOnly")
    private String sendPlainTextOnly;
    @JsonProperty("isTracked")
    private String isTracked;
    @JsonProperty("isPrivate")
    private String isPrivate;
    @JsonProperty("layout")
    private String layout;
    @JsonProperty("style")
    private String style;
    @JsonProperty("forms")
    private List<Form> forms = null;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("hyperlinks")
    private List<Hyperlink> hyperlinks = null;
    @JsonProperty("contentSections")
    private List<ContentSection> contentSections = null;
    @JsonProperty("dynamicContents")
    private List<DynamicContent> dynamicContents = null;
    @JsonProperty("files")
    private List<File> files = null;
    @JsonProperty("contentServiceInstances")
    private List<ContentServiceInstance> contentServiceInstances = null;
    @JsonProperty("emailHeaderId")
    private String emailHeaderId;
    @JsonProperty("emailFooterId")
    private String emailFooterId;
    @JsonProperty("emailGroupId")
    private String emailGroupId;
    @JsonProperty("encodingId")
    private String encodingId;
    @JsonProperty("fieldMerges")
    private List<FieldMerge> fieldMerges = null;
    @JsonProperty("attachments")
    private List<Attachment> attachments = null;
    @JsonProperty("isContentProtected")
    private String isContentProtected;
    @JsonProperty("renderMode")
    private String renderMode;
    @JsonProperty("archive")
    private String archive;
    
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

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("previewText")
    public String getPreviewText() {
        return previewText;
    }

    @JsonProperty("previewText")
    public void setPreviewText(String previewText) {
        this.previewText = previewText;
    }

    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @JsonProperty("senderEmail")
    public String getSenderEmail() {
        return senderEmail;
    }

    @JsonProperty("senderEmail")
    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    @JsonProperty("replyToName")
    public String getReplyToName() {
        return replyToName;
    }

    @JsonProperty("replyToName")
    public void setReplyToName(String replyToName) {
        this.replyToName = replyToName;
    }

    @JsonProperty("replyToEmail")
    public String getReplyToEmail() {
        return replyToEmail;
    }

    @JsonProperty("replyToEmail")
    public void setReplyToEmail(String replyToEmail) {
        this.replyToEmail = replyToEmail;
    }

    @JsonProperty("bounceBackEmail")
    public String getBounceBackEmail() {
        return bounceBackEmail;
    }

    @JsonProperty("bounceBackEmail")
    public void setBounceBackEmail(String bounceBackEmail) {
        this.bounceBackEmail = bounceBackEmail;
    }

    @JsonProperty("virtualMTAId")
    public String getVirtualMTAId() {
        return virtualMTAId;
    }

    @JsonProperty("virtualMTAId")
    public void setVirtualMTAId(String virtualMTAId) {
        this.virtualMTAId = virtualMTAId;
    }

    @JsonProperty("htmlContent")
    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    @JsonProperty("htmlContent")
    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @JsonProperty("plainText")
    public String getPlainText() {
        return plainText;
    }

    @JsonProperty("plainText")
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    @JsonProperty("isPlainTextEditable")
    public String getIsPlainTextEditable() {
        return isPlainTextEditable;
    }

    @JsonProperty("isPlainTextEditable")
    public void setIsPlainTextEditable(String isPlainTextEditable) {
        this.isPlainTextEditable = isPlainTextEditable;
    }

    @JsonProperty("sendPlainTextOnly")
    public String getSendPlainTextOnly() {
        return sendPlainTextOnly;
    }

    @JsonProperty("sendPlainTextOnly")
    public void setSendPlainTextOnly(String sendPlainTextOnly) {
        this.sendPlainTextOnly = sendPlainTextOnly;
    }

    @JsonProperty("isTracked")
    public String getIsTracked() {
        return isTracked;
    }

    @JsonProperty("isTracked")
    public void setIsTracked(String isTracked) {
        this.isTracked = isTracked;
    }

    @JsonProperty("isPrivate")
    public String getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setIsPrivate(String isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("layout")
    public String getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(String layout) {
        this.layout = layout;
    }

    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
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

    @JsonProperty("contentSections")
    public List<ContentSection> getContentSections() {
        return contentSections;
    }

    @JsonProperty("contentSections")
    public void setContentSections(List<ContentSection> contentSections) {
        this.contentSections = contentSections;
    }

    @JsonProperty("dynamicContents")
    public List<DynamicContent> getDynamicContents() {
        return dynamicContents;
    }

    @JsonProperty("dynamicContents")
    public void setDynamicContents(List<DynamicContent> dynamicContents) {
        this.dynamicContents = dynamicContents;
    }

    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(List<File> files) {
        this.files = files;
    }

    @JsonProperty("contentServiceInstances")
    public List<ContentServiceInstance> getContentServiceInstances() {
        return contentServiceInstances;
    }

    @JsonProperty("contentServiceInstances")
    public void setContentServiceInstances(List<ContentServiceInstance> contentServiceInstances) {
        this.contentServiceInstances = contentServiceInstances;
    }

    @JsonProperty("emailHeaderId")
    public String getEmailHeaderId() {
        return emailHeaderId;
    }

    @JsonProperty("emailHeaderId")
    public void setEmailHeaderId(String emailHeaderId) {
        this.emailHeaderId = emailHeaderId;
    }

    @JsonProperty("emailFooterId")
    public String getEmailFooterId() {
        return emailFooterId;
    }

    @JsonProperty("emailFooterId")
    public void setEmailFooterId(String emailFooterId) {
        this.emailFooterId = emailFooterId;
    }

    @JsonProperty("emailGroupId")
    public String getEmailGroupId() {
        return emailGroupId;
    }

    @JsonProperty("emailGroupId")
    public void setEmailGroupId(String emailGroupId) {
        this.emailGroupId = emailGroupId;
    }

    @JsonProperty("encodingId")
    public String getEncodingId() {
        return encodingId;
    }

    @JsonProperty("encodingId")
    public void setEncodingId(String encodingId) {
        this.encodingId = encodingId;
    }

    @JsonProperty("fieldMerges")
    public List<FieldMerge> getFieldMerges() {
        return fieldMerges;
    }

    @JsonProperty("fieldMerges")
    public void setFieldMerges(List<FieldMerge> fieldMerges) {
        this.fieldMerges = fieldMerges;
    }

    @JsonProperty("attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("isContentProtected")
    public String getIsContentProtected() {
        return isContentProtected;
    }

    @JsonProperty("isContentProtected")
    public void setIsContentProtected(String isContentProtected) {
        this.isContentProtected = isContentProtected;
    }

    @JsonProperty("renderMode")
    public String getRenderMode() {
        return renderMode;
    }

    @JsonProperty("renderMode")
    public void setRenderMode(String renderMode) {
        this.renderMode = renderMode;
    }

    @JsonProperty("archive")
    public String getArchive() {
        return archive;
    }

    @JsonProperty("archive")
    public void setArchive(String archive) {
        this.archive = archive;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("currentStatus", currentStatus).append("name", name).append("description", description).append("permissions", permissions).append("folderId", folderId).append("sourceTemplateId", sourceTemplateId).append("createdBy", createdBy).append("createdAt", createdAt).append("updatedBy", updatedBy).append("updatedAt", updatedAt).append("accessedAt", accessedAt).append("scheduledFor", scheduledFor).append("depth", depth).append("subject", subject).append("previewText", previewText).append("senderName", senderName).append("senderEmail", senderEmail).append("replyToName", replyToName).append("replyToEmail", replyToEmail).append("bounceBackEmail", bounceBackEmail).append("virtualMTAId", virtualMTAId).append("htmlContent", htmlContent).append("plainText", plainText).append("isPlainTextEditable", isPlainTextEditable).append("sendPlainTextOnly", sendPlainTextOnly).append("isTracked", isTracked).append("isPrivate", isPrivate).append("layout", layout).append("style", style).append("forms", forms).append("images", images).append("hyperlinks", hyperlinks).append("contentSections", contentSections).append("dynamicContents", dynamicContents).append("files", files).append("contentServiceInstances", contentServiceInstances).append("emailHeaderId", emailHeaderId).append("emailFooterId", emailFooterId).append("emailGroupId", emailGroupId).append("encodingId", encodingId).append("fieldMerges", fieldMerges).append("attachments", attachments).append("isContentProtected", isContentProtected).append("renderMode", renderMode).append("archive", archive).toString();
    }

}
