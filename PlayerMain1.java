package com.hcl;

import java.util.Scanner;

public class PlayerMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 String name;
		 String country;
		 String skill;
		 System.out.println("Enter the player details:");
		 String txt=in.nextLine();
		 String arr[]=txt.split(",");
		 name=arr[0];
		 country=arr[1];
		 skill=arr[2];
		 System.out.println("Player Details\n"+"Player Name:"+arr[0]+"\nCountry name:"+arr[1]+"\n"+"Skill:"+arr[2]);
	}

}
