package com.example.Java_devops_test.consumer;

import com.example.Java_devops_test.models.BreadCrumb;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class QueueConsumer {


    @RabbitListener(queues = "matts_new_queue")
    public void CrumbReceive(@Payload BreadCrumb crumb) {
        System.out.println("######################");
        System.out.println(crumb);
        System.out.println("######################");

    }

    @RabbitListener(queues = "test")
    public void TestReceive(@Payload String test) {
        System.out.println("######################");
        System.out.println(test);
        System.out.println("######################");

    }

}