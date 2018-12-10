
package com.oracle.eloqua.beans;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "currentStatus",
    "id",
    "depth",
    "contentSection",
    "criteria",
    "statement",
    "name"
})
public class Rule {

    @JsonProperty("type")
    private String type;
    @JsonProperty("currentStatus")
    private String currentStatus;
    @JsonProperty("id")
    private String id;
    @JsonProperty("depth")
    private String depth;
    @JsonProperty("contentSection")
    private ContentSection contentSection;
    @JsonProperty("criteria")
    private List<Criterium> criteria = null;
    @JsonProperty("statement")
    private String statement;
    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("currentStatus")
    public String getCurrentStatus() {
        return currentStatus;
    }

    @JsonProperty("currentStatus")
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("depth")
    public String getDepth() {
        return depth;
    }

    @JsonProperty("depth")
    public void setDepth(String depth) {
        this.depth = depth;
    }

    @JsonProperty("contentSection")
    public ContentSection getContentSection() {
        return contentSection;
    }

    @JsonProperty("contentSection")
    public void setContentSection(ContentSection contentSection) {
        this.contentSection = contentSection;
    }

    @JsonProperty("criteria")
    public List<Criterium> getCriteria() {
        return criteria;
    }

    @JsonProperty("criteria")
    public void setCriteria(List<Criterium> criteria) {
        this.criteria = criteria;
    }

    @JsonProperty("statement")
    public String getStatement() {
        return statement;
    }

    @JsonProperty("statement")
    public void setStatement(String statement) {
        this.statement = statement;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("currentStatus", currentStatus).append("id", id).append("depth", depth).append("contentSection", contentSection).append("criteria", criteria).append("statement", statement).append("name", name).toString();
    }

}
