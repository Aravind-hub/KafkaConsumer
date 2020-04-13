package io.spring.kafka.kafkasubscriber.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class FixedRateSubscriber {
	
	private static final Logger log = LoggerFactory.getLogger(FixedRateSubscriber.class);
	
	@KafkaListener(topics = "t_fixedrate")
	public void subscribe(String message) {
		log.info("Subscribed to message : {}",message);
	} 

}
