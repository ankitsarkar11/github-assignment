package com.github.qa.shared.component.user;

import com.github.qa.shared.component.common.AbstractExecutor;
import com.github.qa.shared.component.common.ExtendedResponse;
import com.github.qa.shared.component.user.request.dataobjects.PostUserReposRequest;
import com.github.qa.shared.component.user.response.GetUserReposResponse;
import com.github.qa.shared.component.user.response.PostUserReposResponse;
import io.restassured.http.ContentType;

public class UserExecutor extends AbstractExecutor {
    public UserExecutor(String token) {
        super("https://api.github.com", token); //baseuri fetch from properties file
    }
    public ExtendedResponse<GetUserReposResponse> getUserRepos() {
        return new ExtendedResponse<>(
                restAssured().get("/user/repos"),
                GetUserReposResponse.class
        );
    }
    public ExtendedResponse<PostUserReposResponse> postUserRepos(PostUserReposRequest request) {
        return new ExtendedResponse<>(
                restAssured().contentType(ContentType.JSON).body(request).post("/user/repos"),
                PostUserReposResponse.class
        );
    }
}
