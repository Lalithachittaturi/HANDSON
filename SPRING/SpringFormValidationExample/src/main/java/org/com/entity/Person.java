package org.com.entity;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	@NotNull(message="First name is required atleast 8 characters")
	@Size(min=0,max=8)
	private String firstName;
	@NotNull(message="Last name is required atleast 8 characters")
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	public Person() {
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("IN","India");
		countryOptions.put("USA","America");
		countryOptions.put("AUS","Australia");
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
}
