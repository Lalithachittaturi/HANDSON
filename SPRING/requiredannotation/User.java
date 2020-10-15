package org.requiredannotation;

import org.springframework.beans.factory.annotation.Required;

public class User {
	private String name;
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}
	public void display() {
		System.out.println("Name:"+name+"\n"+"Password:"+password);
	}

}
