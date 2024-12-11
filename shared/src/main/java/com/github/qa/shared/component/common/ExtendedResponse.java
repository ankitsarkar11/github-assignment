package com.github.qa.shared.component.common;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class ExtendedResponse<B> {
    private final Response response;
    private final Class<B> bodyClass;

    public ExtendedResponse(Response response, Class<B> bodyClass) {
        this.response = response;
        this.bodyClass = bodyClass;

        printResponseData();
    }

    public Response response() {
        return response;
    }

    @SuppressWarnings("unchecked")
    public B body() {
        if (bodyClass == String.class) {
            return (B) response.asString();
        }

        if (bodyClass == Response.class) {
            return (B) response;
        }

        return response.as(Optional.ofNullable(bodyClass).orElseThrow(() -> new RuntimeException("Body class is null, can't deserialize the response body")));
    }

    public ExtendedResponse<B> bodyConsumer(Consumer<B> consumer) {
        consumer.accept(body());

        return this;
    }

    public <T> T bodyExtractor(Function<B, T> supplier) {
        return supplier.apply(body());
    }

    public String bodyAsString() {
        return response.asPrettyString();
    }

    public ExtendedResponse<B> statusCode(int statusCode) {
        response.then().statusCode(statusCode);
        return this;
    }

    public int statusCode() {
        return response.statusCode();
    }

    public ExtendedResponse<B> contentType(ContentType contentType) {
        response.then().contentType(contentType);

        return this;
    }

    public ExtendedResponse<B> assertDeserializable() {
        body();

        return this;
    }

    public <T> T path(String s, String... strings) {
        return response().path(s, strings);
    }

    public ValidatableResponse then() {
        return response().then();
    }

    public <T> T as(Class<T> bodyType) {
        return response().as(bodyType);
    }

    private ExtendedResponse<B> printResponseData() {
        String responseAsString = bodyAsString();
        if (responseAsString.isEmpty()) {
            System.out.printf("Response code = %d, response body = empty%n", response.statusCode());
        } else {
            System.out.printf("Response code = %d, response body = %n%s%n", response.statusCode(), responseAsString);
        }
        return this;
    }
}

