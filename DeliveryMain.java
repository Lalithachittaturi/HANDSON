package com.hcl;

import java.util.Scanner;
 

public class DeliveryMain { 
	public void display() {
		System.out.println("Delivery Details:");
		System.out.println("Over:"+1);
		System.out.println("Ball:"+1);
		System.out.println("Runs:"+4);
		System.out.println("Batsman:"+ " Dhoni");
		System.out.println("Bowler:"+ " asa");
		System.out.println("NonStriker:"+ " hby");
		
	}
		public static void main(String[] args) {
		long over;
		long ball;
		long runs;
		String batsman;
		String bowler;
		String nonStriker;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the over:");
		over = s.nextLong();
		s.nextLine();
		System.out.println("Enter the ball:");
		ball = s.nextLong();
		s.nextLine();
		System.out.println("Enter the runs:");
		runs = s.nextLong();
		s.nextLine();
		System.out.println("Enter the batsman name:");
		batsman = s.nextLine();
		System.out.println("Enter the bowler name:");
		bowler = s.nextLine();
		System.out.println("Enter the nonStriker name:");
		nonStriker = s.nextLine();
		DeliveryMain d=new DeliveryMain();
		d.display();
		}

		}