
package com.oracle.eloqua.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Width {


    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

}
