package com.example.Java_devops_test.requestobjects;

import lombok.Value;

@Value
public class AppUploadRequest {

    String deviceId;
    String fileId;
    int fileSize;
    String fileType;
    String firmwareVersion;
    String id;

}
