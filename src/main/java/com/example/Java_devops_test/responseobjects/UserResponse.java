package com.example.Java_devops_test.responseobjects;

import lombok.Value;

@Value
public class UserResponse {
    String username;
    String email;
    String firstname;
    String lastname;
    String phone;
}
