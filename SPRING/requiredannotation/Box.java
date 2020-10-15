package org.requiredannotation;

import org.springframework.stereotype.Component;

@Component
public class Box {
	private User user;
	private int length;
	private int width;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void display() {
		System.out.println("The hall of length "+this.length+" and width "+this.width+" "
				+ "is owned  by "+this.user.getName());
	}


}
