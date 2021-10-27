package com.example.cleanarchitecture.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class MyError {

    private int statusCode;
    private Date timestamp;
    private List<String> messages;
    private String description;

}
