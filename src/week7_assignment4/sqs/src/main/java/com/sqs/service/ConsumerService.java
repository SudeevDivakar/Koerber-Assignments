package com.sqs.service;

import org.springframework.stereotype.Service;

import io.awspring.cloud.sqs.annotation.SqsListener;

@Service
public class ConsumerService {

    @SqsListener(value="lab-4-queue")
    public void myConsumer(String message) {
        System.out.println("Message received:"+message);
    }
}
