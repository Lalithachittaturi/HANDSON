package org.component;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Owner {
	private String name;
	private String password;
	private String mobileNumber;
	public Owner() {
		
	}
	public Owner(String name, String password, String mobileNumber) {
		super();
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void display() {
		System.out.println(getName()+"\n"+getPassword()+"\n"+getMobileNumber());
		System.out.println("Name:"+getName()+"\n"+"Mobile Number:"+getMobileNumber());
		
	}
		

}
