package io.spring.kafka.kafkasubscriber.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.spring.kafka.kafkasubscriber.entity.Employee;

@Service
public class EmployeeJsonSubscriber {
	
	private ObjectMapper objectMapper = new ObjectMapper();
	private static final Logger log = LoggerFactory.getLogger(EmployeeJsonSubscriber.class);
	
	@KafkaListener(topics = "t_hello")
	public void subscribe(String message) throws JsonParseException, JsonMappingException, JsonProcessingException {
		Employee emp = objectMapper.readValue(message, Employee.class);
		log.info("Employee is : {}",emp);
	} 

}
