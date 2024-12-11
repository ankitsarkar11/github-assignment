package com.github.qa.shared.component.repos;

import com.github.qa.shared.component.common.AbstractExecutor;
import com.github.qa.shared.component.common.ExtendedResponse;
import com.github.qa.shared.component.repos.response.GetReposOwnerRepoResponse;

public class ReposExecutor extends AbstractExecutor {
    public ReposExecutor(String token) {
        super("https://api.github.com", token); //baseuri fetch from properties file
    }
    public ExtendedResponse<GetReposOwnerRepoResponse> getReposOwnerRepo(String owner, String repo) {
        return new ExtendedResponse<>(
                restAssured().get("/repos/"+owner+"/"+repo),
                GetReposOwnerRepoResponse.class
        );
    }
}
