package io.spring.kafka.kafkasubscriber.entity;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.spring.kafka.kafkasubscriber.json.CustomLocalDateDeserializer;


public class Employee {

	@JsonProperty("EmployeeID")
	private String employeeId;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("BirthDay")
	@JsonDeserialize(using = CustomLocalDateDeserializer.class)
	private LocalDate birthDate;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeId, String name, LocalDate birthDate) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.birthDate = birthDate;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
