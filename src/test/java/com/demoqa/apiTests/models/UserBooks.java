package com.demoqa.apiTests.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserBooks {
    private String userId;
    private String username;
    private List<Book> books = null;
}
