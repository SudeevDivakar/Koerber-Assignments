package com.client.service;

import com.common.dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService{
    private KafkaTemplate<String, OrderDto> kafkaTemplate;

    @Autowired
    public ClientServiceImpl(KafkaTemplate<String, OrderDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produceOrder(OrderDto orderDto) {
        kafkaTemplate.send("order-topic", orderDto);
        log.info("Order produced: {}", orderDto.toString());
//        System.out.println("Order produced: " + orderDto.toString());
    }
}
