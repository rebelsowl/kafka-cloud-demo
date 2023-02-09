package com.example.kafkaclouddemo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class Topic {

    @Bean
    public NewTopic hobbit(){
        return TopicBuilder.name("hobbit").partitions(5).replicas(1).build();
    }

    @Bean
    public NewTopic hobbit2(){
        return TopicBuilder.name("hobbit2").partitions(2).replicas(1).build();
    }

    @Bean
    public NewTopic counts(){
        return  TopicBuilder.name("streams-wordcount-output").partitions(5).replicas(1).build();
    }


}
