package com.github.qa.shared.component.user.response.dataobjects.postUserReposResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


/**
 * The custom properties that were defined for the repository. The keys are the custom property names, and the values are the corresponding custom property values.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
@Data
public class CustomProperties {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomProperties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomProperties) == false) {
            return false;
        }
        CustomProperties rhs = ((CustomProperties) other);
        return true;
    }

}
