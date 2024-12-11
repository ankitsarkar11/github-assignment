package com.github.qa.shared.component.common;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AbstractExecutor {
    private final String baseUrl;
    @Getter
    private String token;
    public AbstractExecutor(String baseUrl) {
        this.baseUrl=baseUrl;
    }
    public AbstractExecutor(String baseUrl, String token) {
        this.baseUrl=baseUrl;
        this.token=token;
    }
    protected Map<String, String> getHeaders() {
        return Collections.singletonMap("Authorization", "Bearer "+token);
    }
    protected RequestSpecification restAssuredBasic() {
        RestAssuredConfig config= RestAssured.config()
                .httpClient(
                        HttpClientConfig.httpClientConfig()
                                .setParam("http.connection.timeout",30000)
                                .setParam("http.socket.timeout",30000)
                );

        return given().config(config).log().everything().baseUri(this.baseUrl);
    }
    protected RequestSpecification restAssured() {
        return token == null ? restAssuredBasic() : restAssuredBasic().headers(getHeaders());
    }
}
