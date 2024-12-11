package com.github.qa.apitests;

import com.github.qa.apitests.template.AbstractTest;
import com.github.qa.shared.component.repos.ReposExecutor;
import com.github.qa.shared.component.user.UserExecutor;
import com.github.qa.shared.component.user.request.dataobjects.PostUserReposRequest;
import com.github.qa.shared.component.user.response.dataobjects.shared.Error;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.UUID;

public class GithubTests extends AbstractTest {
    @Test
    public void getUserReposTests() {
        UserExecutor users = new UserExecutor(token);
        users.getUserRepos().statusCode(HttpStatus.SC_OK)
                .bodyConsumer(
                        response -> {
                            assertThat.assertFalse(response.getRepositoryData().isEmpty());
                            assertThat.assertFalse(response.getRepositoryData().get(0).getHasIssues());
                            assertThat.assertAll();
                        }
                );
    }

    @Test
    public void getRepoOfUserTests() {
        ReposExecutor repos = new ReposExecutor(token);
        repos.getReposOwnerRepo("tayifo3286", "test_repo").statusCode(HttpStatus.SC_OK)
                .bodyConsumer(
                        response -> {
                            assertThat.assertEquals(response.getFullName(), "tayifo3286/test_repo");
                            assertThat.assertEquals(response.getOwner().getLogin(), "tayifo3286");
                            assertThat.assertAll();
                        }
                );
    }

    @Test
    public void getInvalidRepoOfUserTests() {
        ReposExecutor repos = new ReposExecutor(token);
        repos.getReposOwnerRepo("tayifo3286", "invalid_repo").statusCode(HttpStatus.SC_NOT_FOUND)
                .bodyConsumer(
                        response -> {
                            assertThat.assertEquals(response.getStatus(), (Integer) 404);
                            assertThat.assertEquals(response.getDocumentationUrl(), "https://docs.github.com/rest/repos/repos#get-a-repository");
                            assertThat.assertEquals(response.getMessage(), "Not Found");
                            assertThat.assertAll();
                        }
                );
    }

    @Test
    public void createValidNewRepoTests() throws URISyntaxException {
        String name = UUID.randomUUID().toString();
        String description = "Hello World!!!";
        Boolean isPrivate = false;
        Boolean isTemplate = true;
        URI homepage = new URI("https://github.com");
        UserExecutor repos = new UserExecutor(token);
        repos.postUserRepos(
                        PostUserReposRequest.builder()
                                .name(name)
                                .description(description)
                                ._private(isPrivate)
                                .homepage(homepage)
                                .isTemplate(isTemplate)
                                .build()
                ).statusCode(HttpStatus.SC_CREATED)
                .bodyConsumer(
                        response -> {
                            assertThat.assertEquals(response.getName(), name);
                            assertThat.assertEquals(response.getDescription(), description);
                            assertThat.assertEquals(response.get_private(), isPrivate);
                            assertThat.assertEquals(response.getIsTemplate(), isTemplate);
                            assertThat.assertEquals(response.getHomepage(), homepage);
                            assertThat.assertAll();
                        }
                );
    }

    @Test
    public void createInValidNewRepoTests() throws URISyntaxException {
        String name = ""; //empty name
        String description = "Hello World!!!";
        Boolean isPrivate = false;
        Boolean isTemplate = true;
        URI homepage = new URI("https://github.com");
        UserExecutor repos = new UserExecutor(token);
        repos.postUserRepos(
                        PostUserReposRequest.builder()
                                .name(name)
                                .description(description)
                                ._private(isPrivate)
                                .homepage(homepage)
                                .isTemplate(isTemplate)
                                .build()
                ).statusCode(HttpStatus.SC_UNPROCESSABLE_ENTITY)
                .bodyConsumer(
                        response -> {
                            assertThat.assertEquals(response.getStatus(), (Integer) 422);
                            assertThat.assertTrue(response.getErrors().size() == 2);
                            for (Error error : response.getErrors()) {
                                assertThat.assertTrue(Arrays.asList("missing_field", "custom").contains(error.getCode()));
                                switch (error.getCode()) {
                                    case "missing_field":
                                        assertThat.assertEquals(error.getResource(), "Repository");
                                        assertThat.assertEquals(error.getField(), "name");
                                        break;
                                    case "custom":
                                        assertThat.assertEquals(error.getResource(), "Repository");
                                        assertThat.assertEquals(error.getField(), "name");
                                        assertThat.assertEquals(error.getMessage(), "name is too short (minimum is 1 character)");
                                }
                            }
                            assertThat.assertEquals(response.getDocumentationUrl(), "https://docs.github.com/rest/repos/repos#create-a-repository-for-the-authenticated-user");
                            assertThat.assertAll();
                        }
                );
    }
}