package com.example.kafkaclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication
@EnableKafkaStreams
public class KafkaCloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaCloudDemoApplication.class, args);


		System.out.println("hello world");


	}

}
