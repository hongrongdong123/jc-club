package com.hrd.subject.application.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * description:
 */
@Component
@Slf4j
@RocketMQMessageListener(topic = "first-topic", consumerGroup = "test-consumer")
public class TestMq implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("接收到了message");
    }
}
