package com.example.Java_devops_test.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "SpringData")
public class BreadCrumb {

    @MongoId
    @Persistent
    public int lat;
    public int longi;
    public int height;
    public int gSpeed;






}
