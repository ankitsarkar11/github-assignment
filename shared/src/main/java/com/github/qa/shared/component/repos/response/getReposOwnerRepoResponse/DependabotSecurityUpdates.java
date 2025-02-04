package com.github.qa.shared.component.repos.response.getReposOwnerRepoResponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;


/**
 * Enable or disable Dependabot security updates for the repository.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status"
})
@Data
public class DependabotSecurityUpdates {

    /**
     * The enablement status of Dependabot security updates for the repository.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The enablement status of Dependabot security updates for the repository.")
    public Status status;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DependabotSecurityUpdates.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
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
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DependabotSecurityUpdates) == false) {
            return false;
        }
        DependabotSecurityUpdates rhs = ((DependabotSecurityUpdates) other);
        return ((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status)));
    }


    /**
     * The enablement status of Dependabot security updates for the repository.
     * 
     */
    public enum Status {

        ENABLED("enabled"),
        DISABLED("disabled");
        private final String value;
        private final static Map<String, Status> CONSTANTS = new HashMap<String, Status>();

        static {
            for (Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Status fromValue(String value) {
            Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
