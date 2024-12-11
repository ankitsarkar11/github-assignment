package com.github.qa.shared.component.user.response.dataobjects.postUserReposResponse;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.net.URI;
import java.util.*;


/**
 * Repository
 * <p>
 * A repository on GitHub.
 * 
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
public class Source {

    /**
     * Unique identifier of the repository
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique identifier of the repository")
    public Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("node_id")
    public String nodeId;
    /**
     * The name of the repository.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the repository.")
    public String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("full_name")
    public String fullName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("license")
    public Object license;
    /**
     * 
     * (Required)
     * 
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
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("A GitHub user.")
    public Owner owner;
    /**
     * Whether the repository is private or public.
     * (Required)
     * 
     */
    @JsonProperty("private")
    @JsonPropertyDescription("Whether the repository is private or public.")
    public Boolean _private = false;
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
    @JsonProperty("description")
    public String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fork")
    public Boolean fork;
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
    @JsonProperty("archive_url")
    public String archiveUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignees_url")
    public String assigneesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("blobs_url")
    public String blobsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("branches_url")
    public String branchesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("collaborators_url")
    public String collaboratorsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments_url")
    public String commentsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("commits_url")
    public String commitsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("compare_url")
    public String compareUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contents_url")
    public String contentsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contributors_url")
    public URI contributorsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deployments_url")
    public URI deploymentsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("downloads_url")
    public URI downloadsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("events_url")
    public URI eventsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_url")
    public URI forksUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_commits_url")
    public String gitCommitsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_refs_url")
    public String gitRefsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_tags_url")
    public String gitTagsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("git_url")
    public String gitUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_comment_url")
    public String issueCommentUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_events_url")
    public String issueEventsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issues_url")
    public String issuesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keys_url")
    public String keysUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("labels_url")
    public String labelsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("languages_url")
    public URI languagesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merges_url")
    public URI mergesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("milestones_url")
    public String milestonesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("notifications_url")
    public String notificationsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pulls_url")
    public String pullsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("releases_url")
    public String releasesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssh_url")
    public String sshUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_url")
    public URI stargazersUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("statuses_url")
    public String statusesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscribers_url")
    public URI subscribersUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscription_url")
    public URI subscriptionUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags_url")
    public URI tagsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams_url")
    public URI teamsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("trees_url")
    public String treesUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clone_url")
    public String cloneUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mirror_url")
    public URI mirrorUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hooks_url")
    public URI hooksUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("svn_url")
    public URI svnUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("homepage")
    public URI homepage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public String language;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("forks_count")
    public Integer forksCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stargazers_count")
    public Integer stargazersCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("watchers_count")
    public Integer watchersCount;
    /**
     * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.
     * (Required)
     * 
     */
    @JsonProperty("size")
    @JsonPropertyDescription("The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.")
    public Integer size;
    /**
     * The default branch of the repository.
     * (Required)
     * 
     */
    @JsonProperty("default_branch")
    @JsonPropertyDescription("The default branch of the repository.")
    public String defaultBranch;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_issues_count")
    public Integer openIssuesCount;
    /**
     * Whether this repository acts as a template that can be used to generate new repositories.
     * 
     */
    @JsonProperty("is_template")
    @JsonPropertyDescription("Whether this repository acts as a template that can be used to generate new repositories.")
    public Boolean isTemplate = false;
    @JsonProperty("topics")
    public List<String> topics = new ArrayList<String>();
    /**
     * Whether issues are enabled.
     * (Required)
     * 
     */
    @JsonProperty("has_issues")
    @JsonPropertyDescription("Whether issues are enabled.")
    public Boolean hasIssues = true;
    /**
     * Whether projects are enabled.
     * (Required)
     * 
     */
    @JsonProperty("has_projects")
    @JsonPropertyDescription("Whether projects are enabled.")
    public Boolean hasProjects = true;
    /**
     * Whether the wiki is enabled.
     * (Required)
     * 
     */
    @JsonProperty("has_wiki")
    @JsonPropertyDescription("Whether the wiki is enabled.")
    public Boolean hasWiki = true;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_pages")
    public Boolean hasPages;
    /**
     * Whether downloads are enabled.
     * (Required)
     * 
     */
    @JsonProperty("has_downloads")
    @JsonPropertyDescription("Whether downloads are enabled.")
    public Boolean hasDownloads = true;
    /**
     * Whether discussions are enabled.
     * 
     */
    @JsonProperty("has_discussions")
    @JsonPropertyDescription("Whether discussions are enabled.")
    public Boolean hasDiscussions = false;
    /**
     * Whether the repository is archived.
     * (Required)
     * 
     */
    @JsonProperty("archived")
    @JsonPropertyDescription("Whether the repository is archived.")
    public Boolean archived = false;
    /**
     * Returns whether or not this repository disabled.
     * (Required)
     * 
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("Returns whether or not this repository disabled.")
    public Boolean disabled;
    /**
     * The repository visibility: public, private, or internal.
     * 
     */
    @JsonProperty("visibility")
    @JsonPropertyDescription("The repository visibility: public, private, or internal.")
    public String visibility = "public";
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pushed_at")
    public Date pushedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    public Date createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    public Date updatedAt;
    /**
     * Whether to allow rebase merges for pull requests.
     * 
     */
    @JsonProperty("allow_rebase_merge")
    @JsonPropertyDescription("Whether to allow rebase merges for pull requests.")
    public Boolean allowRebaseMerge = true;
    @JsonProperty("temp_clone_token")
    public String tempCloneToken;
    /**
     * Whether to allow squash merges for pull requests.
     * 
     */
    @JsonProperty("allow_squash_merge")
    @JsonPropertyDescription("Whether to allow squash merges for pull requests.")
    public Boolean allowSquashMerge = true;
    /**
     * Whether to allow Auto-merge to be used on pull requests.
     * 
     */
    @JsonProperty("allow_auto_merge")
    @JsonPropertyDescription("Whether to allow Auto-merge to be used on pull requests.")
    public Boolean allowAutoMerge = false;
    /**
     * Whether to delete head branches when pull requests are merged
     * 
     */
    @JsonProperty("delete_branch_on_merge")
    @JsonPropertyDescription("Whether to delete head branches when pull requests are merged")
    public Boolean deleteBranchOnMerge = false;
    /**
     * Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.
     * 
     */
    @JsonProperty("allow_update_branch")
    @JsonPropertyDescription("Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.")
    public Boolean allowUpdateBranch = false;
    /**
     * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.
     * 
     */
    @JsonProperty("use_squash_pr_title_as_default")
    @JsonPropertyDescription("Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.")
    public Boolean useSquashPrTitleAsDefault = false;
    /**
     * The default value for a squash merge commit title:
     * 
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     * 
     */
    @JsonProperty("squash_merge_commit_title")
    @JsonPropertyDescription("The default value for a squash merge commit title:\n\n- `PR_TITLE` - default to the pull request's title.\n- `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).")
    public SquashMergeCommitTitle squashMergeCommitTitle;
    /**
     * The default value for a squash merge commit message:
     * 
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     * 
     */
    @JsonProperty("squash_merge_commit_message")
    @JsonPropertyDescription("The default value for a squash merge commit message:\n\n- `PR_BODY` - default to the pull request's body.\n- `COMMIT_MESSAGES` - default to the branch's commit messages.\n- `BLANK` - default to a blank commit message.")
    public SquashMergeCommitMessage squashMergeCommitMessage;
    /**
     * The default value for a merge commit title.
     * 
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     * 
     */
    @JsonProperty("merge_commit_title")
    @JsonPropertyDescription("The default value for a merge commit title.\n\n- `PR_TITLE` - default to the pull request's title.\n- `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).")
    public MergeCommitTitle mergeCommitTitle;
    /**
     * The default value for a merge commit message.
     * 
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     * 
     */
    @JsonProperty("merge_commit_message")
    @JsonPropertyDescription("The default value for a merge commit message.\n\n- `PR_TITLE` - default to the pull request's title.\n- `PR_BODY` - default to the pull request's body.\n- `BLANK` - default to a blank commit message.")
    public MergeCommitMessage mergeCommitMessage;
    /**
     * Whether to allow merge commits for pull requests.
     * 
     */
    @JsonProperty("allow_merge_commit")
    @JsonPropertyDescription("Whether to allow merge commits for pull requests.")
    public Boolean allowMergeCommit = true;
    /**
     * Whether to allow forking this repo
     * 
     */
    @JsonProperty("allow_forking")
    @JsonPropertyDescription("Whether to allow forking this repo")
    public Boolean allowForking;
    /**
     * Whether to require contributors to sign off on web-based commits
     * 
     */
    @JsonProperty("web_commit_signoff_required")
    @JsonPropertyDescription("Whether to require contributors to sign off on web-based commits")
    public Boolean webCommitSignoffRequired = false;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_issues")
    public Integer openIssues;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("watchers")
    public Integer watchers;
    @JsonProperty("master_branch")
    public String masterBranch;
    @JsonProperty("starred_at")
    public String starredAt;
    /**
     * Whether anonymous git access is enabled for this repository
     * 
     */
    @JsonProperty("anonymous_access_enabled")
    @JsonPropertyDescription("Whether anonymous git access is enabled for this repository")
    public Boolean anonymousAccessEnabled;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Source.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("license");
        sb.append('=');
        sb.append(((this.license == null)?"<null>":this.license));
        sb.append(',');
        sb.append("forks");
        sb.append('=');
        sb.append(((this.forks == null)?"<null>":this.forks));
        sb.append(',');
        sb.append("permissions");
        sb.append('=');
        sb.append(((this.permissions == null)?"<null>":this.permissions));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("_private");
        sb.append('=');
        sb.append(((this._private == null)?"<null>":this._private));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("fork");
        sb.append('=');
        sb.append(((this.fork == null)?"<null>":this.fork));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("archiveUrl");
        sb.append('=');
        sb.append(((this.archiveUrl == null)?"<null>":this.archiveUrl));
        sb.append(',');
        sb.append("assigneesUrl");
        sb.append('=');
        sb.append(((this.assigneesUrl == null)?"<null>":this.assigneesUrl));
        sb.append(',');
        sb.append("blobsUrl");
        sb.append('=');
        sb.append(((this.blobsUrl == null)?"<null>":this.blobsUrl));
        sb.append(',');
        sb.append("branchesUrl");
        sb.append('=');
        sb.append(((this.branchesUrl == null)?"<null>":this.branchesUrl));
        sb.append(',');
        sb.append("collaboratorsUrl");
        sb.append('=');
        sb.append(((this.collaboratorsUrl == null)?"<null>":this.collaboratorsUrl));
        sb.append(',');
        sb.append("commentsUrl");
        sb.append('=');
        sb.append(((this.commentsUrl == null)?"<null>":this.commentsUrl));
        sb.append(',');
        sb.append("commitsUrl");
        sb.append('=');
        sb.append(((this.commitsUrl == null)?"<null>":this.commitsUrl));
        sb.append(',');
        sb.append("compareUrl");
        sb.append('=');
        sb.append(((this.compareUrl == null)?"<null>":this.compareUrl));
        sb.append(',');
        sb.append("contentsUrl");
        sb.append('=');
        sb.append(((this.contentsUrl == null)?"<null>":this.contentsUrl));
        sb.append(',');
        sb.append("contributorsUrl");
        sb.append('=');
        sb.append(((this.contributorsUrl == null)?"<null>":this.contributorsUrl));
        sb.append(',');
        sb.append("deploymentsUrl");
        sb.append('=');
        sb.append(((this.deploymentsUrl == null)?"<null>":this.deploymentsUrl));
        sb.append(',');
        sb.append("downloadsUrl");
        sb.append('=');
        sb.append(((this.downloadsUrl == null)?"<null>":this.downloadsUrl));
        sb.append(',');
        sb.append("eventsUrl");
        sb.append('=');
        sb.append(((this.eventsUrl == null)?"<null>":this.eventsUrl));
        sb.append(',');
        sb.append("forksUrl");
        sb.append('=');
        sb.append(((this.forksUrl == null)?"<null>":this.forksUrl));
        sb.append(',');
        sb.append("gitCommitsUrl");
        sb.append('=');
        sb.append(((this.gitCommitsUrl == null)?"<null>":this.gitCommitsUrl));
        sb.append(',');
        sb.append("gitRefsUrl");
        sb.append('=');
        sb.append(((this.gitRefsUrl == null)?"<null>":this.gitRefsUrl));
        sb.append(',');
        sb.append("gitTagsUrl");
        sb.append('=');
        sb.append(((this.gitTagsUrl == null)?"<null>":this.gitTagsUrl));
        sb.append(',');
        sb.append("gitUrl");
        sb.append('=');
        sb.append(((this.gitUrl == null)?"<null>":this.gitUrl));
        sb.append(',');
        sb.append("issueCommentUrl");
        sb.append('=');
        sb.append(((this.issueCommentUrl == null)?"<null>":this.issueCommentUrl));
        sb.append(',');
        sb.append("issueEventsUrl");
        sb.append('=');
        sb.append(((this.issueEventsUrl == null)?"<null>":this.issueEventsUrl));
        sb.append(',');
        sb.append("issuesUrl");
        sb.append('=');
        sb.append(((this.issuesUrl == null)?"<null>":this.issuesUrl));
        sb.append(',');
        sb.append("keysUrl");
        sb.append('=');
        sb.append(((this.keysUrl == null)?"<null>":this.keysUrl));
        sb.append(',');
        sb.append("labelsUrl");
        sb.append('=');
        sb.append(((this.labelsUrl == null)?"<null>":this.labelsUrl));
        sb.append(',');
        sb.append("languagesUrl");
        sb.append('=');
        sb.append(((this.languagesUrl == null)?"<null>":this.languagesUrl));
        sb.append(',');
        sb.append("mergesUrl");
        sb.append('=');
        sb.append(((this.mergesUrl == null)?"<null>":this.mergesUrl));
        sb.append(',');
        sb.append("milestonesUrl");
        sb.append('=');
        sb.append(((this.milestonesUrl == null)?"<null>":this.milestonesUrl));
        sb.append(',');
        sb.append("notificationsUrl");
        sb.append('=');
        sb.append(((this.notificationsUrl == null)?"<null>":this.notificationsUrl));
        sb.append(',');
        sb.append("pullsUrl");
        sb.append('=');
        sb.append(((this.pullsUrl == null)?"<null>":this.pullsUrl));
        sb.append(',');
        sb.append("releasesUrl");
        sb.append('=');
        sb.append(((this.releasesUrl == null)?"<null>":this.releasesUrl));
        sb.append(',');
        sb.append("sshUrl");
        sb.append('=');
        sb.append(((this.sshUrl == null)?"<null>":this.sshUrl));
        sb.append(',');
        sb.append("stargazersUrl");
        sb.append('=');
        sb.append(((this.stargazersUrl == null)?"<null>":this.stargazersUrl));
        sb.append(',');
        sb.append("statusesUrl");
        sb.append('=');
        sb.append(((this.statusesUrl == null)?"<null>":this.statusesUrl));
        sb.append(',');
        sb.append("subscribersUrl");
        sb.append('=');
        sb.append(((this.subscribersUrl == null)?"<null>":this.subscribersUrl));
        sb.append(',');
        sb.append("subscriptionUrl");
        sb.append('=');
        sb.append(((this.subscriptionUrl == null)?"<null>":this.subscriptionUrl));
        sb.append(',');
        sb.append("tagsUrl");
        sb.append('=');
        sb.append(((this.tagsUrl == null)?"<null>":this.tagsUrl));
        sb.append(',');
        sb.append("teamsUrl");
        sb.append('=');
        sb.append(((this.teamsUrl == null)?"<null>":this.teamsUrl));
        sb.append(',');
        sb.append("treesUrl");
        sb.append('=');
        sb.append(((this.treesUrl == null)?"<null>":this.treesUrl));
        sb.append(',');
        sb.append("cloneUrl");
        sb.append('=');
        sb.append(((this.cloneUrl == null)?"<null>":this.cloneUrl));
        sb.append(',');
        sb.append("mirrorUrl");
        sb.append('=');
        sb.append(((this.mirrorUrl == null)?"<null>":this.mirrorUrl));
        sb.append(',');
        sb.append("hooksUrl");
        sb.append('=');
        sb.append(((this.hooksUrl == null)?"<null>":this.hooksUrl));
        sb.append(',');
        sb.append("svnUrl");
        sb.append('=');
        sb.append(((this.svnUrl == null)?"<null>":this.svnUrl));
        sb.append(',');
        sb.append("homepage");
        sb.append('=');
        sb.append(((this.homepage == null)?"<null>":this.homepage));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("forksCount");
        sb.append('=');
        sb.append(((this.forksCount == null)?"<null>":this.forksCount));
        sb.append(',');
        sb.append("stargazersCount");
        sb.append('=');
        sb.append(((this.stargazersCount == null)?"<null>":this.stargazersCount));
        sb.append(',');
        sb.append("watchersCount");
        sb.append('=');
        sb.append(((this.watchersCount == null)?"<null>":this.watchersCount));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("defaultBranch");
        sb.append('=');
        sb.append(((this.defaultBranch == null)?"<null>":this.defaultBranch));
        sb.append(',');
        sb.append("openIssuesCount");
        sb.append('=');
        sb.append(((this.openIssuesCount == null)?"<null>":this.openIssuesCount));
        sb.append(',');
        sb.append("isTemplate");
        sb.append('=');
        sb.append(((this.isTemplate == null)?"<null>":this.isTemplate));
        sb.append(',');
        sb.append("topics");
        sb.append('=');
        sb.append(((this.topics == null)?"<null>":this.topics));
        sb.append(',');
        sb.append("hasIssues");
        sb.append('=');
        sb.append(((this.hasIssues == null)?"<null>":this.hasIssues));
        sb.append(',');
        sb.append("hasProjects");
        sb.append('=');
        sb.append(((this.hasProjects == null)?"<null>":this.hasProjects));
        sb.append(',');
        sb.append("hasWiki");
        sb.append('=');
        sb.append(((this.hasWiki == null)?"<null>":this.hasWiki));
        sb.append(',');
        sb.append("hasPages");
        sb.append('=');
        sb.append(((this.hasPages == null)?"<null>":this.hasPages));
        sb.append(',');
        sb.append("hasDownloads");
        sb.append('=');
        sb.append(((this.hasDownloads == null)?"<null>":this.hasDownloads));
        sb.append(',');
        sb.append("hasDiscussions");
        sb.append('=');
        sb.append(((this.hasDiscussions == null)?"<null>":this.hasDiscussions));
        sb.append(',');
        sb.append("archived");
        sb.append('=');
        sb.append(((this.archived == null)?"<null>":this.archived));
        sb.append(',');
        sb.append("disabled");
        sb.append('=');
        sb.append(((this.disabled == null)?"<null>":this.disabled));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("pushedAt");
        sb.append('=');
        sb.append(((this.pushedAt == null)?"<null>":this.pushedAt));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("allowRebaseMerge");
        sb.append('=');
        sb.append(((this.allowRebaseMerge == null)?"<null>":this.allowRebaseMerge));
        sb.append(',');
        sb.append("tempCloneToken");
        sb.append('=');
        sb.append(((this.tempCloneToken == null)?"<null>":this.tempCloneToken));
        sb.append(',');
        sb.append("allowSquashMerge");
        sb.append('=');
        sb.append(((this.allowSquashMerge == null)?"<null>":this.allowSquashMerge));
        sb.append(',');
        sb.append("allowAutoMerge");
        sb.append('=');
        sb.append(((this.allowAutoMerge == null)?"<null>":this.allowAutoMerge));
        sb.append(',');
        sb.append("deleteBranchOnMerge");
        sb.append('=');
        sb.append(((this.deleteBranchOnMerge == null)?"<null>":this.deleteBranchOnMerge));
        sb.append(',');
        sb.append("allowUpdateBranch");
        sb.append('=');
        sb.append(((this.allowUpdateBranch == null)?"<null>":this.allowUpdateBranch));
        sb.append(',');
        sb.append("useSquashPrTitleAsDefault");
        sb.append('=');
        sb.append(((this.useSquashPrTitleAsDefault == null)?"<null>":this.useSquashPrTitleAsDefault));
        sb.append(',');
        sb.append("squashMergeCommitTitle");
        sb.append('=');
        sb.append(((this.squashMergeCommitTitle == null)?"<null>":this.squashMergeCommitTitle));
        sb.append(',');
        sb.append("squashMergeCommitMessage");
        sb.append('=');
        sb.append(((this.squashMergeCommitMessage == null)?"<null>":this.squashMergeCommitMessage));
        sb.append(',');
        sb.append("mergeCommitTitle");
        sb.append('=');
        sb.append(((this.mergeCommitTitle == null)?"<null>":this.mergeCommitTitle));
        sb.append(',');
        sb.append("mergeCommitMessage");
        sb.append('=');
        sb.append(((this.mergeCommitMessage == null)?"<null>":this.mergeCommitMessage));
        sb.append(',');
        sb.append("allowMergeCommit");
        sb.append('=');
        sb.append(((this.allowMergeCommit == null)?"<null>":this.allowMergeCommit));
        sb.append(',');
        sb.append("allowForking");
        sb.append('=');
        sb.append(((this.allowForking == null)?"<null>":this.allowForking));
        sb.append(',');
        sb.append("webCommitSignoffRequired");
        sb.append('=');
        sb.append(((this.webCommitSignoffRequired == null)?"<null>":this.webCommitSignoffRequired));
        sb.append(',');
        sb.append("openIssues");
        sb.append('=');
        sb.append(((this.openIssues == null)?"<null>":this.openIssues));
        sb.append(',');
        sb.append("watchers");
        sb.append('=');
        sb.append(((this.watchers == null)?"<null>":this.watchers));
        sb.append(',');
        sb.append("masterBranch");
        sb.append('=');
        sb.append(((this.masterBranch == null)?"<null>":this.masterBranch));
        sb.append(',');
        sb.append("starredAt");
        sb.append('=');
        sb.append(((this.starredAt == null)?"<null>":this.starredAt));
        sb.append(',');
        sb.append("anonymousAccessEnabled");
        sb.append('=');
        sb.append(((this.anonymousAccessEnabled == null)?"<null>":this.anonymousAccessEnabled));
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
        result = ((result* 31)+((this.allowAutoMerge == null)? 0 :this.allowAutoMerge.hashCode()));
        result = ((result* 31)+((this.sshUrl == null)? 0 :this.sshUrl.hashCode()));
        result = ((result* 31)+((this.archiveUrl == null)? 0 :this.archiveUrl.hashCode()));
        result = ((result* 31)+((this.languagesUrl == null)? 0 :this.languagesUrl.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.assigneesUrl == null)? 0 :this.assigneesUrl.hashCode()));
        result = ((result* 31)+((this.commitsUrl == null)? 0 :this.commitsUrl.hashCode()));
        result = ((result* 31)+((this.openIssues == null)? 0 :this.openIssues.hashCode()));
        result = ((result* 31)+((this.cloneUrl == null)? 0 :this.cloneUrl.hashCode()));
        result = ((result* 31)+((this.forksCount == null)? 0 :this.forksCount.hashCode()));
        result = ((result* 31)+((this.subscribersUrl == null)? 0 :this.subscribersUrl.hashCode()));
        result = ((result* 31)+((this.allowUpdateBranch == null)? 0 :this.allowUpdateBranch.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.starredAt == null)? 0 :this.starredAt.hashCode()));
        result = ((result* 31)+((this.forksUrl == null)? 0 :this.forksUrl.hashCode()));
        result = ((result* 31)+((this.watchersCount == null)? 0 :this.watchersCount.hashCode()));
        result = ((result* 31)+((this._private == null)? 0 :this._private.hashCode()));
        result = ((result* 31)+((this.permissions == null)? 0 :this.permissions.hashCode()));
        result = ((result* 31)+((this.anonymousAccessEnabled == null)? 0 :this.anonymousAccessEnabled.hashCode()));
        result = ((result* 31)+((this.masterBranch == null)? 0 :this.masterBranch.hashCode()));
        result = ((result* 31)+((this.issueCommentUrl == null)? 0 :this.issueCommentUrl.hashCode()));
        result = ((result* 31)+((this.statusesUrl == null)? 0 :this.statusesUrl.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.collaboratorsUrl == null)? 0 :this.collaboratorsUrl.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.allowMergeCommit == null)? 0 :this.allowMergeCommit.hashCode()));
        result = ((result* 31)+((this.forks == null)? 0 :this.forks.hashCode()));
        result = ((result* 31)+((this.allowForking == null)? 0 :this.allowForking.hashCode()));
        result = ((result* 31)+((this.labelsUrl == null)? 0 :this.labelsUrl.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.defaultBranch == null)? 0 :this.defaultBranch.hashCode()));
        result = ((result* 31)+((this.tempCloneToken == null)? 0 :this.tempCloneToken.hashCode()));
        result = ((result* 31)+((this.keysUrl == null)? 0 :this.keysUrl.hashCode()));
        result = ((result* 31)+((this.downloadsUrl == null)? 0 :this.downloadsUrl.hashCode()));
        result = ((result* 31)+((this.mergeCommitTitle == null)? 0 :this.mergeCommitTitle.hashCode()));
        result = ((result* 31)+((this.contentsUrl == null)? 0 :this.contentsUrl.hashCode()));
        result = ((result* 31)+((this.pushedAt == null)? 0 :this.pushedAt.hashCode()));
        result = ((result* 31)+((this.tagsUrl == null)? 0 :this.tagsUrl.hashCode()));
        result = ((result* 31)+((this.license == null)? 0 :this.license.hashCode()));
        result = ((result* 31)+((this.commentsUrl == null)? 0 :this.commentsUrl.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.isTemplate == null)? 0 :this.isTemplate.hashCode()));
        result = ((result* 31)+((this.treesUrl == null)? 0 :this.treesUrl.hashCode()));
        result = ((result* 31)+((this.allowRebaseMerge == null)? 0 :this.allowRebaseMerge.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.mergesUrl == null)? 0 :this.mergesUrl.hashCode()));
        result = ((result* 31)+((this.nodeId == null)? 0 :this.nodeId.hashCode()));
        result = ((result* 31)+((this.teamsUrl == null)? 0 :this.teamsUrl.hashCode()));
        result = ((result* 31)+((this.blobsUrl == null)? 0 :this.blobsUrl.hashCode()));
        result = ((result* 31)+((this.useSquashPrTitleAsDefault == null)? 0 :this.useSquashPrTitleAsDefault.hashCode()));
        result = ((result* 31)+((this.issueEventsUrl == null)? 0 :this.issueEventsUrl.hashCode()));
        result = ((result* 31)+((this.hasPages == null)? 0 :this.hasPages.hashCode()));
        result = ((result* 31)+((this.milestonesUrl == null)? 0 :this.milestonesUrl.hashCode()));
        result = ((result* 31)+((this.issuesUrl == null)? 0 :this.issuesUrl.hashCode()));
        result = ((result* 31)+((this.webCommitSignoffRequired == null)? 0 :this.webCommitSignoffRequired.hashCode()));
        result = ((result* 31)+((this.releasesUrl == null)? 0 :this.releasesUrl.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.watchers == null)? 0 :this.watchers.hashCode()));
        result = ((result* 31)+((this.branchesUrl == null)? 0 :this.branchesUrl.hashCode()));
        result = ((result* 31)+((this.contributorsUrl == null)? 0 :this.contributorsUrl.hashCode()));
        result = ((result* 31)+((this.gitRefsUrl == null)? 0 :this.gitRefsUrl.hashCode()));
        result = ((result* 31)+((this.hooksUrl == null)? 0 :this.hooksUrl.hashCode()));
        result = ((result* 31)+((this.openIssuesCount == null)? 0 :this.openIssuesCount.hashCode()));
        result = ((result* 31)+((this.archived == null)? 0 :this.archived.hashCode()));
        result = ((result* 31)+((this.stargazersCount == null)? 0 :this.stargazersCount.hashCode()));
        result = ((result* 31)+((this.deleteBranchOnMerge == null)? 0 :this.deleteBranchOnMerge.hashCode()));
        result = ((result* 31)+((this.disabled == null)? 0 :this.disabled.hashCode()));
        result = ((result* 31)+((this.hasIssues == null)? 0 :this.hasIssues.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.hasWiki == null)? 0 :this.hasWiki.hashCode()));
        result = ((result* 31)+((this.compareUrl == null)? 0 :this.compareUrl.hashCode()));
        result = ((result* 31)+((this.gitCommitsUrl == null)? 0 :this.gitCommitsUrl.hashCode()));
        result = ((result* 31)+((this.topics == null)? 0 :this.topics.hashCode()));
        result = ((result* 31)+((this.htmlUrl == null)? 0 :this.htmlUrl.hashCode()));
        result = ((result* 31)+((this.stargazersUrl == null)? 0 :this.stargazersUrl.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.svnUrl == null)? 0 :this.svnUrl.hashCode()));
        result = ((result* 31)+((this.hasDiscussions == null)? 0 :this.hasDiscussions.hashCode()));
        result = ((result* 31)+((this.mergeCommitMessage == null)? 0 :this.mergeCommitMessage.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.pullsUrl == null)? 0 :this.pullsUrl.hashCode()));
        result = ((result* 31)+((this.mirrorUrl == null)? 0 :this.mirrorUrl.hashCode()));
        result = ((result* 31)+((this.hasDownloads == null)? 0 :this.hasDownloads.hashCode()));
        result = ((result* 31)+((this.fork == null)? 0 :this.fork.hashCode()));
        result = ((result* 31)+((this.allowSquashMerge == null)? 0 :this.allowSquashMerge.hashCode()));
        result = ((result* 31)+((this.hasProjects == null)? 0 :this.hasProjects.hashCode()));
        result = ((result* 31)+((this.deploymentsUrl == null)? 0 :this.deploymentsUrl.hashCode()));
        result = ((result* 31)+((this.squashMergeCommitTitle == null)? 0 :this.squashMergeCommitTitle.hashCode()));
        result = ((result* 31)+((this.eventsUrl == null)? 0 :this.eventsUrl.hashCode()));
        result = ((result* 31)+((this.squashMergeCommitMessage == null)? 0 :this.squashMergeCommitMessage.hashCode()));
        result = ((result* 31)+((this.gitTagsUrl == null)? 0 :this.gitTagsUrl.hashCode()));
        result = ((result* 31)+((this.notificationsUrl == null)? 0 :this.notificationsUrl.hashCode()));
        result = ((result* 31)+((this.gitUrl == null)? 0 :this.gitUrl.hashCode()));
        result = ((result* 31)+((this.subscriptionUrl == null)? 0 :this.subscriptionUrl.hashCode()));
        result = ((result* 31)+((this.homepage == null)? 0 :this.homepage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.allowAutoMerge == rhs.allowAutoMerge)||((this.allowAutoMerge!= null)&&this.allowAutoMerge.equals(rhs.allowAutoMerge)))&&((this.sshUrl == rhs.sshUrl)||((this.sshUrl!= null)&&this.sshUrl.equals(rhs.sshUrl))))&&((this.archiveUrl == rhs.archiveUrl)||((this.archiveUrl!= null)&&this.archiveUrl.equals(rhs.archiveUrl))))&&((this.languagesUrl == rhs.languagesUrl)||((this.languagesUrl!= null)&&this.languagesUrl.equals(rhs.languagesUrl))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.assigneesUrl == rhs.assigneesUrl)||((this.assigneesUrl!= null)&&this.assigneesUrl.equals(rhs.assigneesUrl))))&&((this.commitsUrl == rhs.commitsUrl)||((this.commitsUrl!= null)&&this.commitsUrl.equals(rhs.commitsUrl))))&&((this.openIssues == rhs.openIssues)||((this.openIssues!= null)&&this.openIssues.equals(rhs.openIssues))))&&((this.cloneUrl == rhs.cloneUrl)||((this.cloneUrl!= null)&&this.cloneUrl.equals(rhs.cloneUrl))))&&((this.forksCount == rhs.forksCount)||((this.forksCount!= null)&&this.forksCount.equals(rhs.forksCount))))&&((this.subscribersUrl == rhs.subscribersUrl)||((this.subscribersUrl!= null)&&this.subscribersUrl.equals(rhs.subscribersUrl))))&&((this.allowUpdateBranch == rhs.allowUpdateBranch)||((this.allowUpdateBranch!= null)&&this.allowUpdateBranch.equals(rhs.allowUpdateBranch))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.starredAt == rhs.starredAt)||((this.starredAt!= null)&&this.starredAt.equals(rhs.starredAt))))&&((this.forksUrl == rhs.forksUrl)||((this.forksUrl!= null)&&this.forksUrl.equals(rhs.forksUrl))))&&((this.watchersCount == rhs.watchersCount)||((this.watchersCount!= null)&&this.watchersCount.equals(rhs.watchersCount))))&&((this._private == rhs._private)||((this._private!= null)&&this._private.equals(rhs._private))))&&((this.permissions == rhs.permissions)||((this.permissions!= null)&&this.permissions.equals(rhs.permissions))))&&((this.anonymousAccessEnabled == rhs.anonymousAccessEnabled)||((this.anonymousAccessEnabled!= null)&&this.anonymousAccessEnabled.equals(rhs.anonymousAccessEnabled))))&&((this.masterBranch == rhs.masterBranch)||((this.masterBranch!= null)&&this.masterBranch.equals(rhs.masterBranch))))&&((this.issueCommentUrl == rhs.issueCommentUrl)||((this.issueCommentUrl!= null)&&this.issueCommentUrl.equals(rhs.issueCommentUrl))))&&((this.statusesUrl == rhs.statusesUrl)||((this.statusesUrl!= null)&&this.statusesUrl.equals(rhs.statusesUrl))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.collaboratorsUrl == rhs.collaboratorsUrl)||((this.collaboratorsUrl!= null)&&this.collaboratorsUrl.equals(rhs.collaboratorsUrl))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.allowMergeCommit == rhs.allowMergeCommit)||((this.allowMergeCommit!= null)&&this.allowMergeCommit.equals(rhs.allowMergeCommit))))&&((this.forks == rhs.forks)||((this.forks!= null)&&this.forks.equals(rhs.forks))))&&((this.allowForking == rhs.allowForking)||((this.allowForking!= null)&&this.allowForking.equals(rhs.allowForking))))&&((this.labelsUrl == rhs.labelsUrl)||((this.labelsUrl!= null)&&this.labelsUrl.equals(rhs.labelsUrl))))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.defaultBranch == rhs.defaultBranch)||((this.defaultBranch!= null)&&this.defaultBranch.equals(rhs.defaultBranch))))&&((this.tempCloneToken == rhs.tempCloneToken)||((this.tempCloneToken!= null)&&this.tempCloneToken.equals(rhs.tempCloneToken))))&&((this.keysUrl == rhs.keysUrl)||((this.keysUrl!= null)&&this.keysUrl.equals(rhs.keysUrl))))&&((this.downloadsUrl == rhs.downloadsUrl)||((this.downloadsUrl!= null)&&this.downloadsUrl.equals(rhs.downloadsUrl))))&&((this.mergeCommitTitle == rhs.mergeCommitTitle)||((this.mergeCommitTitle!= null)&&this.mergeCommitTitle.equals(rhs.mergeCommitTitle))))&&((this.contentsUrl == rhs.contentsUrl)||((this.contentsUrl!= null)&&this.contentsUrl.equals(rhs.contentsUrl))))&&((this.pushedAt == rhs.pushedAt)||((this.pushedAt!= null)&&this.pushedAt.equals(rhs.pushedAt))))&&((this.tagsUrl == rhs.tagsUrl)||((this.tagsUrl!= null)&&this.tagsUrl.equals(rhs.tagsUrl))))&&((this.license == rhs.license)||((this.license!= null)&&this.license.equals(rhs.license))))&&((this.commentsUrl == rhs.commentsUrl)||((this.commentsUrl!= null)&&this.commentsUrl.equals(rhs.commentsUrl))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.isTemplate == rhs.isTemplate)||((this.isTemplate!= null)&&this.isTemplate.equals(rhs.isTemplate))))&&((this.treesUrl == rhs.treesUrl)||((this.treesUrl!= null)&&this.treesUrl.equals(rhs.treesUrl))))&&((this.allowRebaseMerge == rhs.allowRebaseMerge)||((this.allowRebaseMerge!= null)&&this.allowRebaseMerge.equals(rhs.allowRebaseMerge))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.mergesUrl == rhs.mergesUrl)||((this.mergesUrl!= null)&&this.mergesUrl.equals(rhs.mergesUrl))))&&((this.nodeId == rhs.nodeId)||((this.nodeId!= null)&&this.nodeId.equals(rhs.nodeId))))&&((this.teamsUrl == rhs.teamsUrl)||((this.teamsUrl!= null)&&this.teamsUrl.equals(rhs.teamsUrl))))&&((this.blobsUrl == rhs.blobsUrl)||((this.blobsUrl!= null)&&this.blobsUrl.equals(rhs.blobsUrl))))&&((this.useSquashPrTitleAsDefault == rhs.useSquashPrTitleAsDefault)||((this.useSquashPrTitleAsDefault!= null)&&this.useSquashPrTitleAsDefault.equals(rhs.useSquashPrTitleAsDefault))))&&((this.issueEventsUrl == rhs.issueEventsUrl)||((this.issueEventsUrl!= null)&&this.issueEventsUrl.equals(rhs.issueEventsUrl))))&&((this.hasPages == rhs.hasPages)||((this.hasPages!= null)&&this.hasPages.equals(rhs.hasPages))))&&((this.milestonesUrl == rhs.milestonesUrl)||((this.milestonesUrl!= null)&&this.milestonesUrl.equals(rhs.milestonesUrl))))&&((this.issuesUrl == rhs.issuesUrl)||((this.issuesUrl!= null)&&this.issuesUrl.equals(rhs.issuesUrl))))&&((this.webCommitSignoffRequired == rhs.webCommitSignoffRequired)||((this.webCommitSignoffRequired!= null)&&this.webCommitSignoffRequired.equals(rhs.webCommitSignoffRequired))))&&((this.releasesUrl == rhs.releasesUrl)||((this.releasesUrl!= null)&&this.releasesUrl.equals(rhs.releasesUrl))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.watchers == rhs.watchers)||((this.watchers!= null)&&this.watchers.equals(rhs.watchers))))&&((this.branchesUrl == rhs.branchesUrl)||((this.branchesUrl!= null)&&this.branchesUrl.equals(rhs.branchesUrl))))&&((this.contributorsUrl == rhs.contributorsUrl)||((this.contributorsUrl!= null)&&this.contributorsUrl.equals(rhs.contributorsUrl))))&&((this.gitRefsUrl == rhs.gitRefsUrl)||((this.gitRefsUrl!= null)&&this.gitRefsUrl.equals(rhs.gitRefsUrl))))&&((this.hooksUrl == rhs.hooksUrl)||((this.hooksUrl!= null)&&this.hooksUrl.equals(rhs.hooksUrl))))&&((this.openIssuesCount == rhs.openIssuesCount)||((this.openIssuesCount!= null)&&this.openIssuesCount.equals(rhs.openIssuesCount))))&&((this.archived == rhs.archived)||((this.archived!= null)&&this.archived.equals(rhs.archived))))&&((this.stargazersCount == rhs.stargazersCount)||((this.stargazersCount!= null)&&this.stargazersCount.equals(rhs.stargazersCount))))&&((this.deleteBranchOnMerge == rhs.deleteBranchOnMerge)||((this.deleteBranchOnMerge!= null)&&this.deleteBranchOnMerge.equals(rhs.deleteBranchOnMerge))))&&((this.disabled == rhs.disabled)||((this.disabled!= null)&&this.disabled.equals(rhs.disabled))))&&((this.hasIssues == rhs.hasIssues)||((this.hasIssues!= null)&&this.hasIssues.equals(rhs.hasIssues))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.hasWiki == rhs.hasWiki)||((this.hasWiki!= null)&&this.hasWiki.equals(rhs.hasWiki))))&&((this.compareUrl == rhs.compareUrl)||((this.compareUrl!= null)&&this.compareUrl.equals(rhs.compareUrl))))&&((this.gitCommitsUrl == rhs.gitCommitsUrl)||((this.gitCommitsUrl!= null)&&this.gitCommitsUrl.equals(rhs.gitCommitsUrl))))&&((this.topics == rhs.topics)||((this.topics!= null)&&this.topics.equals(rhs.topics))))&&((this.htmlUrl == rhs.htmlUrl)||((this.htmlUrl!= null)&&this.htmlUrl.equals(rhs.htmlUrl))))&&((this.stargazersUrl == rhs.stargazersUrl)||((this.stargazersUrl!= null)&&this.stargazersUrl.equals(rhs.stargazersUrl))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.svnUrl == rhs.svnUrl)||((this.svnUrl!= null)&&this.svnUrl.equals(rhs.svnUrl))))&&((this.hasDiscussions == rhs.hasDiscussions)||((this.hasDiscussions!= null)&&this.hasDiscussions.equals(rhs.hasDiscussions))))&&((this.mergeCommitMessage == rhs.mergeCommitMessage)||((this.mergeCommitMessage!= null)&&this.mergeCommitMessage.equals(rhs.mergeCommitMessage))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.pullsUrl == rhs.pullsUrl)||((this.pullsUrl!= null)&&this.pullsUrl.equals(rhs.pullsUrl))))&&((this.mirrorUrl == rhs.mirrorUrl)||((this.mirrorUrl!= null)&&this.mirrorUrl.equals(rhs.mirrorUrl))))&&((this.hasDownloads == rhs.hasDownloads)||((this.hasDownloads!= null)&&this.hasDownloads.equals(rhs.hasDownloads))))&&((this.fork == rhs.fork)||((this.fork!= null)&&this.fork.equals(rhs.fork))))&&((this.allowSquashMerge == rhs.allowSquashMerge)||((this.allowSquashMerge!= null)&&this.allowSquashMerge.equals(rhs.allowSquashMerge))))&&((this.hasProjects == rhs.hasProjects)||((this.hasProjects!= null)&&this.hasProjects.equals(rhs.hasProjects))))&&((this.deploymentsUrl == rhs.deploymentsUrl)||((this.deploymentsUrl!= null)&&this.deploymentsUrl.equals(rhs.deploymentsUrl))))&&((this.squashMergeCommitTitle == rhs.squashMergeCommitTitle)||((this.squashMergeCommitTitle!= null)&&this.squashMergeCommitTitle.equals(rhs.squashMergeCommitTitle))))&&((this.eventsUrl == rhs.eventsUrl)||((this.eventsUrl!= null)&&this.eventsUrl.equals(rhs.eventsUrl))))&&((this.squashMergeCommitMessage == rhs.squashMergeCommitMessage)||((this.squashMergeCommitMessage!= null)&&this.squashMergeCommitMessage.equals(rhs.squashMergeCommitMessage))))&&((this.gitTagsUrl == rhs.gitTagsUrl)||((this.gitTagsUrl!= null)&&this.gitTagsUrl.equals(rhs.gitTagsUrl))))&&((this.notificationsUrl == rhs.notificationsUrl)||((this.notificationsUrl!= null)&&this.notificationsUrl.equals(rhs.notificationsUrl))))&&((this.gitUrl == rhs.gitUrl)||((this.gitUrl!= null)&&this.gitUrl.equals(rhs.gitUrl))))&&((this.subscriptionUrl == rhs.subscriptionUrl)||((this.subscriptionUrl!= null)&&this.subscriptionUrl.equals(rhs.subscriptionUrl))))&&((this.homepage == rhs.homepage)||((this.homepage!= null)&&this.homepage.equals(rhs.homepage))));
    }


    /**
     * The default value for a merge commit message.
     * 
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     * 
     */
    public enum MergeCommitMessage {

        PR_BODY("PR_BODY"),
        PR_TITLE("PR_TITLE"),
        BLANK("BLANK");
        private final String value;
        private final static Map<String, MergeCommitMessage> CONSTANTS = new HashMap<String, MergeCommitMessage>();

        static {
            for (MergeCommitMessage c: values()) {
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
     * 
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     * 
     */
    public enum MergeCommitTitle {

        PR_TITLE("PR_TITLE"),
        MERGE_MESSAGE("MERGE_MESSAGE");
        private final String value;
        private final static Map<String, MergeCommitTitle> CONSTANTS = new HashMap<String, MergeCommitTitle>();

        static {
            for (MergeCommitTitle c: values()) {
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
     * 
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     * 
     */
    public enum SquashMergeCommitMessage {

        PR_BODY("PR_BODY"),
        COMMIT_MESSAGES("COMMIT_MESSAGES"),
        BLANK("BLANK");
        private final String value;
        private final static Map<String, SquashMergeCommitMessage> CONSTANTS = new HashMap<String, SquashMergeCommitMessage>();

        static {
            for (SquashMergeCommitMessage c: values()) {
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
     * 
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     * 
     */
    public enum SquashMergeCommitTitle {

        PR_TITLE("PR_TITLE"),
        COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE");
        private final String value;
        private final static Map<String, SquashMergeCommitTitle> CONSTANTS = new HashMap<String, SquashMergeCommitTitle>();

        static {
            for (SquashMergeCommitTitle c: values()) {
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
