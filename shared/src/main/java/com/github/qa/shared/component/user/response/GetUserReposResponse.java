package com.github.qa.shared.component.user.response;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.qa.shared.component.user.response.dataobjects.getUserReposResponse.Owner;
import com.github.qa.shared.component.user.response.dataobjects.getUserReposResponse.Permissions;
import lombok.Data;


/**
 * Repository
 * <p>
 * A repository on GitHub.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "node_id",
        "name",
        "full_name",
        "license",
        "forks",
        "permissions",
        "owner",
        "private",
        "html_url",
        "description",
        "fork",
        "url",
        "archive_url",
        "assignees_url",
        "blobs_url",
        "branches_url",
        "collaborators_url",
        "comments_url",
        "commits_url",
        "compare_url",
        "contents_url",
        "contributors_url",
        "deployments_url",
        "downloads_url",
        "events_url",
        "forks_url",
        "git_commits_url",
        "git_refs_url",
        "git_tags_url",
        "git_url",
        "issue_comment_url",
        "issue_events_url",
        "issues_url",
        "keys_url",
        "labels_url",
        "languages_url",
        "merges_url",
        "milestones_url",
        "notifications_url",
        "pulls_url",
        "releases_url",
        "ssh_url",
        "stargazers_url",
        "statuses_url",
        "subscribers_url",
        "subscription_url",
        "tags_url",
        "teams_url",
        "trees_url",
        "clone_url",
        "mirror_url",
        "hooks_url",
        "svn_url",
        "homepage",
        "language",
        "forks_count",
        "stargazers_count",
        "watchers_count",
        "size",
        "default_branch",
        "open_issues_count",
        "is_template",
        "topics",
        "has_issues",
        "has_projects",
        "has_wiki",
        "has_pages",
        "has_downloads",
        "has_discussions",
        "archived",
        "disabled",
        "visibility",
        "pushed_at",
        "created_at",
        "updated_at",
        "allow_rebase_merge",
        "temp_clone_token",
        "allow_squash_merge",
        "allow_auto_merge",
        "delete_branch_on_merge",
        "allow_update_branch",
        "use_squash_pr_title_as_default",
        "squash_merge_commit_title",
        "squash_merge_commit_message",
        "merge_commit_title",
        "merge_commit_message",
        "allow_merge_commit",
        "allow_forking",
        "web_commit_signoff_required",
        "open_issues",
        "watchers",
        "master_branch",
        "starred_at",
        "anonymous_access_enabled"
})
@Data
public class GetUserReposResponse {
    List<RepositoryData> repositoryData;

    @JsonCreator
    public GetUserReposResponse(List<RepositoryData> repositoryData) {
        this.repositoryData = repositoryData;
    }

    @Data
    public static class RepositoryData {
        /**
         * Unique identifier of the repository
         * (Required)
         */
        @JsonProperty("id")
        @JsonPropertyDescription("Unique identifier of the repository")
        public Integer id;
        /**
         * (Required)
         */
        @JsonProperty("node_id")
        public String nodeId;
        /**
         * The name of the repository.
         * (Required)
         */
        @JsonProperty("name")
        @JsonPropertyDescription("The name of the repository.")
        public String name;
        /**
         * (Required)
         */
        @JsonProperty("full_name")
        public String fullName;
        /**
         * (Required)
         */
        @JsonProperty("license")
        public Object license;
        /**
         * (Required)
         */
        @JsonProperty("forks")
        public Integer forks;
        @JsonProperty("permissions")
        public Permissions permissions;
        /**
         * Simple User
         * <p>
         * A GitHub user.
         * (Required)
         */
        @JsonProperty("owner")
        @JsonPropertyDescription("A GitHub user.")
        public Owner owner;
        /**
         * Whether the repository is private or public.
         * (Required)
         */
        @JsonProperty("private")
        @JsonPropertyDescription("Whether the repository is private or public.")
        public Boolean _private = false;
        /**
         * (Required)
         */
        @JsonProperty("html_url")
        public URI htmlUrl;
        /**
         * (Required)
         */
        @JsonProperty("description")
        public String description;
        /**
         * (Required)
         */
        @JsonProperty("fork")
        public Boolean fork;
        /**
         * (Required)
         */
        @JsonProperty("url")
        public URI url;
        /**
         * (Required)
         */
        @JsonProperty("archive_url")
        public String archiveUrl;
        /**
         * (Required)
         */
        @JsonProperty("assignees_url")
        public String assigneesUrl;
        /**
         * (Required)
         */
        @JsonProperty("blobs_url")
        public String blobsUrl;
        /**
         * (Required)
         */
        @JsonProperty("branches_url")
        public String branchesUrl;
        /**
         * (Required)
         */
        @JsonProperty("collaborators_url")
        public String collaboratorsUrl;
        /**
         * (Required)
         */
        @JsonProperty("comments_url")
        public String commentsUrl;
        /**
         * (Required)
         */
        @JsonProperty("commits_url")
        public String commitsUrl;
        /**
         * (Required)
         */
        @JsonProperty("compare_url")
        public String compareUrl;
        /**
         * (Required)
         */
        @JsonProperty("contents_url")
        public String contentsUrl;
        /**
         * (Required)
         */
        @JsonProperty("contributors_url")
        public URI contributorsUrl;
        /**
         * (Required)
         */
        @JsonProperty("deployments_url")
        public URI deploymentsUrl;
        /**
         * (Required)
         */
        @JsonProperty("downloads_url")
        public URI downloadsUrl;
        /**
         * (Required)
         */
        @JsonProperty("events_url")
        public URI eventsUrl;
        /**
         * (Required)
         */
        @JsonProperty("forks_url")
        public URI forksUrl;
        /**
         * (Required)
         */
        @JsonProperty("git_commits_url")
        public String gitCommitsUrl;
        /**
         * (Required)
         */
        @JsonProperty("git_refs_url")
        public String gitRefsUrl;
        /**
         * (Required)
         */
        @JsonProperty("git_tags_url")
        public String gitTagsUrl;
        /**
         * (Required)
         */
        @JsonProperty("git_url")
        public String gitUrl;
        /**
         * (Required)
         */
        @JsonProperty("issue_comment_url")
        public String issueCommentUrl;
        /**
         * (Required)
         */
        @JsonProperty("issue_events_url")
        public String issueEventsUrl;
        /**
         * (Required)
         */
        @JsonProperty("issues_url")
        public String issuesUrl;
        /**
         * (Required)
         */
        @JsonProperty("keys_url")
        public String keysUrl;
        /**
         * (Required)
         */
        @JsonProperty("labels_url")
        public String labelsUrl;
        /**
         * (Required)
         */
        @JsonProperty("languages_url")
        public URI languagesUrl;
        /**
         * (Required)
         */
        @JsonProperty("merges_url")
        public URI mergesUrl;
        /**
         * (Required)
         */
        @JsonProperty("milestones_url")
        public String milestonesUrl;
        /**
         * (Required)
         */
        @JsonProperty("notifications_url")
        public String notificationsUrl;
        /**
         * (Required)
         */
        @JsonProperty("pulls_url")
        public String pullsUrl;
        /**
         * (Required)
         */
        @JsonProperty("releases_url")
        public String releasesUrl;
        /**
         * (Required)
         */
        @JsonProperty("ssh_url")
        public String sshUrl;
        /**
         * (Required)
         */
        @JsonProperty("stargazers_url")
        public URI stargazersUrl;
        /**
         * (Required)
         */
        @JsonProperty("statuses_url")
        public String statusesUrl;
        /**
         * (Required)
         */
        @JsonProperty("subscribers_url")
        public URI subscribersUrl;
        /**
         * (Required)
         */
        @JsonProperty("subscription_url")
        public URI subscriptionUrl;
        /**
         * (Required)
         */
        @JsonProperty("tags_url")
        public URI tagsUrl;
        /**
         * (Required)
         */
        @JsonProperty("teams_url")
        public URI teamsUrl;
        /**
         * (Required)
         */
        @JsonProperty("trees_url")
        public String treesUrl;
        /**
         * (Required)
         */
        @JsonProperty("clone_url")
        public String cloneUrl;
        /**
         * (Required)
         */
        @JsonProperty("mirror_url")
        public URI mirrorUrl;
        /**
         * (Required)
         */
        @JsonProperty("hooks_url")
        public URI hooksUrl;
        /**
         * (Required)
         */
        @JsonProperty("svn_url")
        public URI svnUrl;
        /**
         * (Required)
         */
        @JsonProperty("homepage")
        public URI homepage;
        /**
         * (Required)
         */
        @JsonProperty("language")
        public String language;
        /**
         * (Required)
         */
        @JsonProperty("forks_count")
        public Integer forksCount;
        /**
         * (Required)
         */
        @JsonProperty("stargazers_count")
        public Integer stargazersCount;
        /**
         * (Required)
         */
        @JsonProperty("watchers_count")
        public Integer watchersCount;
        /**
         * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.
         * (Required)
         */
        @JsonProperty("size")
        @JsonPropertyDescription("The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.")
        public Integer size;
        /**
         * The default branch of the repository.
         * (Required)
         */
        @JsonProperty("default_branch")
        @JsonPropertyDescription("The default branch of the repository.")
        public String defaultBranch;
        /**
         * (Required)
         */
        @JsonProperty("open_issues_count")
        public Integer openIssuesCount;
        /**
         * Whether this repository acts as a template that can be used to generate new repositories.
         */
        @JsonProperty("is_template")
        @JsonPropertyDescription("Whether this repository acts as a template that can be used to generate new repositories.")
        public Boolean isTemplate = false;
        @JsonProperty("topics")
        public List<String> topics;
        /**
         * Whether issues are enabled.
         * (Required)
         */
        @JsonProperty("has_issues")
        @JsonPropertyDescription("Whether issues are enabled.")
        public Boolean hasIssues = true;
        /**
         * Whether projects are enabled.
         * (Required)
         */
        @JsonProperty("has_projects")
        @JsonPropertyDescription("Whether projects are enabled.")
        public Boolean hasProjects = true;
        /**
         * Whether the wiki is enabled.
         * (Required)
         */
        @JsonProperty("has_wiki")
        @JsonPropertyDescription("Whether the wiki is enabled.")
        public Boolean hasWiki = true;
        /**
         * (Required)
         */
        @JsonProperty("has_pages")
        public Boolean hasPages;
        /**
         * Whether downloads are enabled.
         * (Required)
         */
        @JsonProperty("has_downloads")
        @JsonPropertyDescription("Whether downloads are enabled.")
        public Boolean hasDownloads = true;
        /**
         * Whether discussions are enabled.
         */
        @JsonProperty("has_discussions")
        @JsonPropertyDescription("Whether discussions are enabled.")
        public Boolean hasDiscussions = false;
        /**
         * Whether the repository is archived.
         * (Required)
         */
        @JsonProperty("archived")
        @JsonPropertyDescription("Whether the repository is archived.")
        public Boolean archived = false;
        /**
         * Returns whether or not this repository disabled.
         * (Required)
         */
        @JsonProperty("disabled")
        @JsonPropertyDescription("Returns whether or not this repository disabled.")
        public Boolean disabled;
        /**
         * The repository visibility: public, private, or internal.
         */
        @JsonProperty("visibility")
        @JsonPropertyDescription("The repository visibility: public, private, or internal.")
        public String visibility = "public";
        /**
         * (Required)
         */
        @JsonProperty("pushed_at")
        public Date pushedAt;
        /**
         * (Required)
         */
        @JsonProperty("created_at")
        public Date createdAt;
        /**
         * (Required)
         */
        @JsonProperty("updated_at")
        public Date updatedAt;
        /**
         * Whether to allow rebase merges for pull requests.
         */
        @JsonProperty("allow_rebase_merge")
        @JsonPropertyDescription("Whether to allow rebase merges for pull requests.")
        public Boolean allowRebaseMerge = true;
        @JsonProperty("temp_clone_token")
        public String tempCloneToken;
        /**
         * Whether to allow squash merges for pull requests.
         */
        @JsonProperty("allow_squash_merge")
        @JsonPropertyDescription("Whether to allow squash merges for pull requests.")
        public Boolean allowSquashMerge = true;
        /**
         * Whether to allow Auto-merge to be used on pull requests.
         */
        @JsonProperty("allow_auto_merge")
        @JsonPropertyDescription("Whether to allow Auto-merge to be used on pull requests.")
        public Boolean allowAutoMerge = false;
        /**
         * Whether to delete head branches when pull requests are merged
         */
        @JsonProperty("delete_branch_on_merge")
        @JsonPropertyDescription("Whether to delete head branches when pull requests are merged")
        public Boolean deleteBranchOnMerge = false;
        /**
         * Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.
         */
        @JsonProperty("allow_update_branch")
        @JsonPropertyDescription("Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.")
        public Boolean allowUpdateBranch = false;
        /**
         * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.
         */
        @JsonProperty("use_squash_pr_title_as_default")
        @JsonPropertyDescription("Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.")
        public Boolean useSquashPrTitleAsDefault = false;
        /**
         * The default value for a squash merge commit title:
         * <p>
         * - `PR_TITLE` - default to the pull request's title.
         * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
         */
        @JsonProperty("squash_merge_commit_title")
        @JsonPropertyDescription("The default value for a squash merge commit title:\n\n- `PR_TITLE` - default to the pull request's title.\n- `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).")
        public SquashMergeCommitTitle squashMergeCommitTitle;
        /**
         * The default value for a squash merge commit message:
         * <p>
         * - `PR_BODY` - default to the pull request's body.
         * - `COMMIT_MESSAGES` - default to the branch's commit messages.
         * - `BLANK` - default to a blank commit message.
         */
        @JsonProperty("squash_merge_commit_message")
        @JsonPropertyDescription("The default value for a squash merge commit message:\n\n- `PR_BODY` - default to the pull request's body.\n- `COMMIT_MESSAGES` - default to the branch's commit messages.\n- `BLANK` - default to a blank commit message.")
        public SquashMergeCommitMessage squashMergeCommitMessage;
        /**
         * The default value for a merge commit title.
         * <p>
         * - `PR_TITLE` - default to the pull request's title.
         * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
         */
        @JsonProperty("merge_commit_title")
        @JsonPropertyDescription("The default value for a merge commit title.\n\n- `PR_TITLE` - default to the pull request's title.\n- `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).")
        public MergeCommitTitle mergeCommitTitle;
        /**
         * The default value for a merge commit message.
         * <p>
         * - `PR_TITLE` - default to the pull request's title.
         * - `PR_BODY` - default to the pull request's body.
         * - `BLANK` - default to a blank commit message.
         */
        @JsonProperty("merge_commit_message")
        @JsonPropertyDescription("The default value for a merge commit message.\n\n- `PR_TITLE` - default to the pull request's title.\n- `PR_BODY` - default to the pull request's body.\n- `BLANK` - default to a blank commit message.")
        public MergeCommitMessage mergeCommitMessage;
        /**
         * Whether to allow merge commits for pull requests.
         */
        @JsonProperty("allow_merge_commit")
        @JsonPropertyDescription("Whether to allow merge commits for pull requests.")
        public Boolean allowMergeCommit = true;
        /**
         * Whether to allow forking this repo
         */
        @JsonProperty("allow_forking")
        @JsonPropertyDescription("Whether to allow forking this repo")
        public Boolean allowForking;
        /**
         * Whether to require contributors to sign off on web-based commits
         */
        @JsonProperty("web_commit_signoff_required")
        @JsonPropertyDescription("Whether to require contributors to sign off on web-based commits")
        public Boolean webCommitSignoffRequired = false;
        /**
         * (Required)
         */
        @JsonProperty("open_issues")
        public Integer openIssues;
        /**
         * (Required)
         */
        @JsonProperty("watchers")
        public Integer watchers;
        @JsonProperty("master_branch")
        public String masterBranch;
        @JsonProperty("starred_at")
        public String starredAt;
        /**
         * Whether anonymous git access is enabled for this repository
         */
        @JsonProperty("anonymous_access_enabled")
        @JsonPropertyDescription("Whether anonymous git access is enabled for this repository")
        public Boolean anonymousAccessEnabled;
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


        /**
         * The default value for a merge commit message.
         * <p>
         * - `PR_TITLE` - default to the pull request's title.
         * - `PR_BODY` - default to the pull request's body.
         * - `BLANK` - default to a blank commit message.
         */
        public enum MergeCommitMessage {
            PR_BODY("PR_BODY"),
            PR_TITLE("PR_TITLE"),
            BLANK("BLANK");
            private final String value;
            private final static Map<String, MergeCommitMessage> CONSTANTS = new HashMap<String, MergeCommitMessage>();

            static {
                for (MergeCommitMessage c : values()) {
                    CONSTANTS.put(c.value, c);
                }
            }

            MergeCommitMessage(String value) {
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
            public static MergeCommitMessage fromValue(String value) {
                MergeCommitMessage constant = CONSTANTS.get(value);
                if (constant == null) {
                    throw new IllegalArgumentException(value);
                } else {
                    return constant;
                }
            }

        }


        /**
         * The default value for a merge commit title.
         * <p>
         * - `PR_TITLE` - default to the pull request's title.
         * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
         */
        public enum MergeCommitTitle {
            PR_TITLE("PR_TITLE"),
            MERGE_MESSAGE("MERGE_MESSAGE");
            private final String value;
            private final static Map<String, MergeCommitTitle> CONSTANTS = new HashMap<String, MergeCommitTitle>();

            static {
                for (MergeCommitTitle c : values()) {
                    CONSTANTS.put(c.value, c);
                }
            }

            MergeCommitTitle(String value) {
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
            public static MergeCommitTitle fromValue(String value) {
                MergeCommitTitle constant = CONSTANTS.get(value);
                if (constant == null) {
                    throw new IllegalArgumentException(value);
                } else {
                    return constant;
                }
            }

        }


        /**
         * The default value for a squash merge commit message:
         * <p>
         * - `PR_BODY` - default to the pull request's body.
         * - `COMMIT_MESSAGES` - default to the branch's commit messages.
         * - `BLANK` - default to a blank commit message.
         */
        public enum SquashMergeCommitMessage {
            PR_BODY("PR_BODY"),
            COMMIT_MESSAGES("COMMIT_MESSAGES"),
            BLANK("BLANK");
            private final String value;
            private final static Map<String, SquashMergeCommitMessage> CONSTANTS = new HashMap<String, SquashMergeCommitMessage>();

            static {
                for (SquashMergeCommitMessage c : values()) {
                    CONSTANTS.put(c.value, c);
                }
            }

            SquashMergeCommitMessage(String value) {
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
            public static SquashMergeCommitMessage fromValue(String value) {
                SquashMergeCommitMessage constant = CONSTANTS.get(value);
                if (constant == null) {
                    throw new IllegalArgumentException(value);
                } else {
                    return constant;
                }
            }

        }


        /**
         * The default value for a squash merge commit title:
         * <p>
         * - `PR_TITLE` - default to the pull request's title.
         * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
         */
        public enum SquashMergeCommitTitle {
            PR_TITLE("PR_TITLE"),
            COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE");
            private final String value;
            private final static Map<String, SquashMergeCommitTitle> CONSTANTS = new HashMap<String, SquashMergeCommitTitle>();

            static {
                for (SquashMergeCommitTitle c : values()) {
                    CONSTANTS.put(c.value, c);
                }
            }

            SquashMergeCommitTitle(String value) {
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
            public static SquashMergeCommitTitle fromValue(String value) {
                SquashMergeCommitTitle constant = CONSTANTS.get(value);
                if (constant == null) {
                    throw new IllegalArgumentException(value);
                } else {
                    return constant;
                }
            }

        }
    }

}