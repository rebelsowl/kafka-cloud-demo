package com.example.kafkaclouddemo;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

/* change key-value serializers in application.properties to use
    @KafkaListener(topics = {"hobbit"}, groupId = "spring-boot-kafka")
    public void consume(ConsumerRecord<Integer, String> record){

        System.out.println("received | id : " + record.key() + " value: " + record.value());
    }
 */


    @KafkaListener(topics = {"streams-wordcount-output"}, groupId = "spring-boot-kafka")
    public void consumeWordCount(ConsumerRecord<String, Long> record){

        System.out.println("word counts | key : " + record.key() + " value: " + record.value());
    }


}
