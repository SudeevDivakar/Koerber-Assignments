package com.server.service;

import com.common.dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServerServiceImpl implements ServerService {

    @KafkaListener(topics = "order-topic", groupId = "server")
    public void consume(OrderDto orderDto) {
        log.info("Order consumed: {}", orderDto.toString());
        System.out.println("Order consumed: "+orderDto.toString());
    }

}
