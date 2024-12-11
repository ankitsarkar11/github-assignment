package com.github.qa.shared.component.user.response.dataobjects.getUserReposResponse;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


/**
 * Simple User
 * <p>
 * A GitHub user.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "email",
        "login",
        "id",
        "node_id",
        "avatar_url",
        "gravatar_id",
        "url",
        "html_url",
        "followers_url",
        "following_url",
        "gists_url",
        "starred_url",
        "subscriptions_url",
        "organizations_url",
        "repos_url",
        "events_url",
        "received_events_url",
        "type",
        "site_admin",
        "starred_at",
        "user_view_type"
})
@Data
public class Owner {
    @JsonProperty("name")
    public String name;
    @JsonProperty("email")
    public String email;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("login")
    public String login;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    public Integer id;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("node_id")
    public String nodeId;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("avatar_url")
    public URI avatarUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("gravatar_id")
    public String gravatarId;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("url")
    public URI url;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("html_url")
    public URI htmlUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("followers_url")
    public URI followersUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("following_url")
    public String followingUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("gists_url")
    public String gistsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("starred_url")
    public String starredUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("subscriptions_url")
    public URI subscriptionsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("organizations_url")
    public URI organizationsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("repos_url")
    public URI reposUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("events_url")
    public String eventsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("received_events_url")
    public URI receivedEventsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("type")
    public String type;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("site_admin")
    public Boolean siteAdmin;
    @JsonProperty("starred_at")
    public String starredAt;
    @JsonProperty("user_view_type")
    public String userViewType;
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