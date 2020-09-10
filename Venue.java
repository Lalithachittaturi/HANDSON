package com.hcl;

public class Venue {
	private String name;
	private static String city;

	public Venue(String name, String city) {
		this.name = name;
		this.city = city;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static String getCity() {
		return city;
	}
}
