package com.github.qa.shared.component.repos.response.getReposOwnerRepoResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "admin",
    "maintain",
    "push",
    "triage",
    "pull"
})
@Data
public class Permissions {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("admin")
    public Boolean admin;
    @JsonProperty("maintain")
    public Boolean maintain;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("push")
    public Boolean push;
    @JsonProperty("triage")
    public Boolean triage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pull")
    public Boolean pull;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Permissions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("admin");
        sb.append('=');
        sb.append(((this.admin == null)?"<null>":this.admin));
        sb.append(',');
        sb.append("maintain");
        sb.append('=');
        sb.append(((this.maintain == null)?"<null>":this.maintain));
        sb.append(',');
        sb.append("push");
        sb.append('=');
        sb.append(((this.push == null)?"<null>":this.push));
        sb.append(',');
        sb.append("triage");
        sb.append('=');
        sb.append(((this.triage == null)?"<null>":this.triage));
        sb.append(',');
        sb.append("pull");
        sb.append('=');
        sb.append(((this.pull == null)?"<null>":this.pull));
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
        result = ((result* 31)+((this.admin == null)? 0 :this.admin.hashCode()));
        result = ((result* 31)+((this.pull == null)? 0 :this.pull.hashCode()));
        result = ((result* 31)+((this.triage == null)? 0 :this.triage.hashCode()));
        result = ((result* 31)+((this.maintain == null)? 0 :this.maintain.hashCode()));
        result = ((result* 31)+((this.push == null)? 0 :this.push.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permissions) == false) {
            return false;
        }
        Permissions rhs = ((Permissions) other);
        return ((((((this.admin == rhs.admin)||((this.admin!= null)&&this.admin.equals(rhs.admin)))&&((this.pull == rhs.pull)||((this.pull!= null)&&this.pull.equals(rhs.pull))))&&((this.triage == rhs.triage)||((this.triage!= null)&&this.triage.equals(rhs.triage))))&&((this.maintain == rhs.maintain)||((this.maintain!= null)&&this.maintain.equals(rhs.maintain))))&&((this.push == rhs.push)||((this.push!= null)&&this.push.equals(rhs.push))));
    }

}
