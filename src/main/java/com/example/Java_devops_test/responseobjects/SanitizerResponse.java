package com.example.Java_devops_test.responseobjects;

import lombok.Value;

@Value
public class SanitizerResponse {
    String sanitizedString;
    boolean badPass;

}

