package com.hcl;

import java.util.*;
public class Venue1{
	public static void main(String[] args) {
		UI x=new UI();
		x.run();
	}
}
class VenueMain {
	private String name;
	private String city;

	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String n) {
		city = n;
	}
}
class UI extends VenueMain{

	public void getVenueName() {
		String temp;
		System.out.println("Venue Name:");
		Scanner s=new Scanner(System.in);
		temp=s.nextLine();
		setName(temp);}

	public void getCityName() {
		String temp;
		System.out.println("City Name:");
		Scanner s=new Scanner(System.in);
		temp=s.nextLine();
		setCity(temp);}
	public void details() {

		System.out.println("Enter Venue Details:");
		System.out.println("The name is:"+getName());
		System.out.println("The city is:"+getCity());
	}

	public void Menu(){
		System.out.println("MENU");
		System.out.println("1. Update Venue Name");
		System.out.println("2. Update City Name");
		System.out.println("3. All Information Correct/Exit");
		System.out.println("Type 1 or 2 or 3");
	}
	public void run() {
		int x;
		getVenueName();
		getCityName();
		details();
		Scanner s=new Scanner(System.in);
		while(true) {
			Menu();
			x=s.nextInt();
			switch(x) {
			case 1:
				getVenueName();
				details();
				break;
			case 2:
				getCityName();
				details();
				break;
			case 3:
				return;
			}
		}
	}
}
