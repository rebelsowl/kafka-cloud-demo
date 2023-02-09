# Demo Project for Spring Kafka


### producer

timed producer creates messages from hobbit faker and pushes them to kafka


### consumer

Listens various topics and prints out messages


### topic

Create various topics with beans

### stream
First @EnableKafkaStreams at main class. Listens hobbit topic, and counts words, publishes counts to streams-wordcount-output as state store named counts.

### rest endpoints

GET /count/{word} reads word's state from streams-wordcount-output and returns count.