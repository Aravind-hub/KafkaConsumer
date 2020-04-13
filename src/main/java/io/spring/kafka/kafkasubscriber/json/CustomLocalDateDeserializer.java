package io.spring.kafka.kafkasubscriber.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.format.datetime.joda.LocalDateParser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CustomLocalDateDeserializer extends StdDeserializer<LocalDate>{

	private static final long serialVersionUID = 1L;
	
	protected CustomLocalDateDeserializer() {
		super(LocalDate.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LocalDate deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		return LocalDate.parse(p.readValueAs(String.class),formatter);
	}

	
}
