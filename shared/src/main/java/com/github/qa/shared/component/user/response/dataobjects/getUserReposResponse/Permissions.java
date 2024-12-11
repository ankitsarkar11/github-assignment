package com.github.qa.shared.component.user.response.dataobjects.getUserReposResponse;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "admin",
        "pull",
        "triage",
        "push",
        "maintain"
})

public class Permissions {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("admin")
    public Boolean admin;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pull")
    public Boolean pull;
    @JsonProperty("triage")
    public Boolean triage;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("push")
    public Boolean push;
    @JsonProperty("maintain")
    public Boolean maintain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}