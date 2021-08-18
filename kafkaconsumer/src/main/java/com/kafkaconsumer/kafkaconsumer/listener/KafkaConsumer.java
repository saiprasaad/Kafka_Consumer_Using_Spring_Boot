package com.kafkaconsumer.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * service for kafka consumer.
 */
@Service
public class KafkaConsumer {

  @KafkaListener(topics = "test", groupId = "group_json")
  public void consume(String message) {
    System.out.println("Consumed message: " + message);
  }

  @KafkaListener(topics = "jsontest", groupId = "group_json_1")
  public void consumeJson(String message) {
    System.out.println("Consumed Json message: " + message);
  }
}