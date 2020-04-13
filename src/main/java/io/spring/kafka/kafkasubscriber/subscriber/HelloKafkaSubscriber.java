package io.spring.kafka.kafkasubscriber.subscriber;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class HelloKafkaSubscriber {
	
	@KafkaListener(topics = "t_hello")
	public void subscribe(String message) {
		System.out.println("The message we received from the topic is "+message);
	}

}
