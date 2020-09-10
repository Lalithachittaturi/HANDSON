package com.hcl;

public class Player {
	private String name;
	private String country;
	private String skill;

	public Player(String name,
	String country,
	String skill) {
		this.name = name;
		this.country = country;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}
}
