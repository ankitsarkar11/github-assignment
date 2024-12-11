package com.github.qa.shared.component.user.response.dataobjects.postUserReposResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.net.URI;


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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Owner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("login");
        sb.append('=');
        sb.append(((this.login == null)?"<null>":this.login));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("gravatarId");
        sb.append('=');
        sb.append(((this.gravatarId == null)?"<null>":this.gravatarId));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("followersUrl");
        sb.append('=');
        sb.append(((this.followersUrl == null)?"<null>":this.followersUrl));
        sb.append(',');
        sb.append("followingUrl");
        sb.append('=');
        sb.append(((this.followingUrl == null)?"<null>":this.followingUrl));
        sb.append(',');
        sb.append("gistsUrl");
        sb.append('=');
        sb.append(((this.gistsUrl == null)?"<null>":this.gistsUrl));
        sb.append(',');
        sb.append("starredUrl");
        sb.append('=');
        sb.append(((this.starredUrl == null)?"<null>":this.starredUrl));
        sb.append(',');
        sb.append("subscriptionsUrl");
        sb.append('=');
        sb.append(((this.subscriptionsUrl == null)?"<null>":this.subscriptionsUrl));
        sb.append(',');
        sb.append("organizationsUrl");
        sb.append('=');
        sb.append(((this.organizationsUrl == null)?"<null>":this.organizationsUrl));
        sb.append(',');
        sb.append("reposUrl");
        sb.append('=');
        sb.append(((this.reposUrl == null)?"<null>":this.reposUrl));
        sb.append(',');
        sb.append("eventsUrl");
        sb.append('=');
        sb.append(((this.eventsUrl == null)?"<null>":this.eventsUrl));
        sb.append(',');
        sb.append("receivedEventsUrl");
        sb.append('=');
        sb.append(((this.receivedEventsUrl == null)?"<null>":this.receivedEventsUrl));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("siteAdmin");
        sb.append('=');
        sb.append(((this.siteAdmin == null)?"<null>":this.siteAdmin));
        sb.append(',');
        sb.append("starredAt");
        sb.append('=');
        sb.append(((this.starredAt == null)?"<null>":this.starredAt));
        sb.append(',');
        sb.append("userViewType");
        sb.append('=');
        sb.append(((this.userViewType == null)?"<null>":this.userViewType));
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
        result = ((result* 31)+((this.receivedEventsUrl == null)? 0 :this.receivedEventsUrl.hashCode()));
        result = ((result* 31)+((this.siteAdmin == null)? 0 :this.siteAdmin.hashCode()));
        result = ((result* 31)+((this.followingUrl == null)? 0 :this.followingUrl.hashCode()));
        result = ((result* 31)+((this.gistsUrl == null)? 0 :this.gistsUrl.hashCode()));
        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
        result = ((result* 31)+((this.organizationsUrl == null)? 0 :this.organizationsUrl.hashCode()));
        result = ((result* 31)+((this.reposUrl == null)? 0 :this.reposUrl.hashCode()));
        result = ((result* 31)+((this.htmlUrl == null)? 0 :this.htmlUrl.hashCode()));
        result = ((result* 31)+((this.subscriptionsUrl == null)? 0 :this.subscriptionsUrl.hashCode()));
        result = ((result* 31)+((this.userViewType == null)? 0 :this.userViewType.hashCode()));
        result = ((result* 31)+((this.login == null)? 0 :this.login.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.starredUrl == null)? 0 :this.starredUrl.hashCode()));
        result = ((result* 31)+((this.gravatarId == null)? 0 :this.gravatarId.hashCode()));
        result = ((result* 31)+((this.starredAt == null)? 0 :this.starredAt.hashCode()));
        result = ((result* 31)+((this.followersUrl == null)? 0 :this.followersUrl.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.eventsUrl == null)? 0 :this.eventsUrl.hashCode()));
        result = ((result* 31)+((this.nodeId == null)? 0 :this.nodeId.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Owner) == false) {
            return false;
        }
        Owner rhs = ((Owner) other);
        return (((((((((((((((((((((((this.receivedEventsUrl == rhs.receivedEventsUrl)||((this.receivedEventsUrl!= null)&&this.receivedEventsUrl.equals(rhs.receivedEventsUrl)))&&((this.siteAdmin == rhs.siteAdmin)||((this.siteAdmin!= null)&&this.siteAdmin.equals(rhs.siteAdmin))))&&((this.followingUrl == rhs.followingUrl)||((this.followingUrl!= null)&&this.followingUrl.equals(rhs.followingUrl))))&&((this.gistsUrl == rhs.gistsUrl)||((this.gistsUrl!= null)&&this.gistsUrl.equals(rhs.gistsUrl))))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.organizationsUrl == rhs.organizationsUrl)||((this.organizationsUrl!= null)&&this.organizationsUrl.equals(rhs.organizationsUrl))))&&((this.reposUrl == rhs.reposUrl)||((this.reposUrl!= null)&&this.reposUrl.equals(rhs.reposUrl))))&&((this.htmlUrl == rhs.htmlUrl)||((this.htmlUrl!= null)&&this.htmlUrl.equals(rhs.htmlUrl))))&&((this.subscriptionsUrl == rhs.subscriptionsUrl)||((this.subscriptionsUrl!= null)&&this.subscriptionsUrl.equals(rhs.subscriptionsUrl))))&&((this.userViewType == rhs.userViewType)||((this.userViewType!= null)&&this.userViewType.equals(rhs.userViewType))))&&((this.login == rhs.login)||((this.login!= null)&&this.login.equals(rhs.login))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.starredUrl == rhs.starredUrl)||((this.starredUrl!= null)&&this.starredUrl.equals(rhs.starredUrl))))&&((this.gravatarId == rhs.gravatarId)||((this.gravatarId!= null)&&this.gravatarId.equals(rhs.gravatarId))))&&((this.starredAt == rhs.starredAt)||((this.starredAt!= null)&&this.starredAt.equals(rhs.starredAt))))&&((this.followersUrl == rhs.followersUrl)||((this.followersUrl!= null)&&this.followersUrl.equals(rhs.followersUrl))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.eventsUrl == rhs.eventsUrl)||((this.eventsUrl!= null)&&this.eventsUrl.equals(rhs.eventsUrl))))&&((this.nodeId == rhs.nodeId)||((this.nodeId!= null)&&this.nodeId.equals(rhs.nodeId))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
