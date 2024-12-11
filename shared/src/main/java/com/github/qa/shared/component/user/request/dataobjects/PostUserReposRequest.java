package com.github.qa.shared.component.user.request.dataobjects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.net.URI;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostUserReposRequest {
    //{
    //    "name": "Hello-World",
    //    "description": "This is your first repo!",
    //    "homepage": "https://github.com",
    //    "private": false,
    //    "is_template": true
    //}
    String name;
    String description;
    URI homepage;
    @JsonProperty("private")
    Boolean _private;
    @JsonProperty("is_template")
    Boolean isTemplate;
}
