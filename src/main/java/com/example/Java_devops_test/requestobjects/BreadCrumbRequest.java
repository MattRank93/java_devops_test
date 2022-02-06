package com.example.Java_devops_test.requestobjects;


import lombok.Value;

@Value
public class BreadCrumbRequest {

    int lat;
    int longi;
    int height;
    int gSpeed;
}
