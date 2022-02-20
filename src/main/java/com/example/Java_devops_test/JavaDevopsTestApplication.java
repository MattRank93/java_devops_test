package com.example.Java_devops_test;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableRabbit
@SpringBootApplication
public class JavaDevopsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDevopsTestApplication.class, args);
	}

}
