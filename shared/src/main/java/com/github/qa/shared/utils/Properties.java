package com.github.qa.shared.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;
import java.util.ResourceBundle;

@Getter
@AllArgsConstructor
public enum Properties {
    GITHUB_API_BASE_URL("githubAPIBaseURL"),
    GITHUB_UI_BASE_URL("githubUIBaseURL"),
    USER_EMAIL("userEmail"),
    USER_PASSWORD("userPassword"),
    USERNAME("username"),
    DEFAULT_REPO("defaultRepo"),
    ACCESS_TOKEN("accessToken");

    private final String key;
    private final ResourceBundle config=ResourceBundle.getBundle("shared-config");
    private final ResourceBundle envProperties=ResourceBundle.getBundle(config.getString("env"));
    public String value() {
        return Optional.ofNullable(System.getProperty(key)).orElse(envProperties.getString(key));
    }
    public Integer integerValue() {
        return Integer.parseInt(value());
    }
    public Boolean booleanValue() {
        return Boolean.parseBoolean(value());
    }
    public String getEnvironment() {
        return config.getString("env");
    }
    @Override
    public String toString() {
        return value();
    }

}
