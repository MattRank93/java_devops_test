package com.example.Java_devops_test.consumer;

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
    public void receive(@Payload Message message) {
//        System.out.println("Message " + Arrays.toString(message.getBody()));
        System.out.println(message.getBody());
        System.out.println("recieved");
    }

}