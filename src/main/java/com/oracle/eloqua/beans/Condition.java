
package com.oracle.eloqua.beans;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "isConditionallyNegated",
    "conditionalFieldCriteria"
})
public class Condition {

    @JsonProperty("type")
    private String type;
    @JsonProperty("isConditionallyNegated")
    private String isConditionallyNegated;
    @JsonProperty("conditionalFieldCriteria")
    private List<ConditionalFieldCriterium> conditionalFieldCriteria = null;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("isConditionallyNegated")
    public String getIsConditionallyNegated() {
        return isConditionallyNegated;
    }

    @JsonProperty("isConditionallyNegated")
    public void setIsConditionallyNegated(String isConditionallyNegated) {
        this.isConditionallyNegated = isConditionallyNegated;
    }

    @JsonProperty("conditionalFieldCriteria")
    public List<ConditionalFieldCriterium> getConditionalFieldCriteria() {
        return conditionalFieldCriteria;
    }

    @JsonProperty("conditionalFieldCriteria")
    public void setConditionalFieldCriteria(List<ConditionalFieldCriterium> conditionalFieldCriteria) {
        this.conditionalFieldCriteria = conditionalFieldCriteria;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("isConditionallyNegated", isConditionallyNegated).append("conditionalFieldCriteria", conditionalFieldCriteria).toString();
    }

}
