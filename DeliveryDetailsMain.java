package com.hcl;

import java.util.Scanner;

public class DeliveryDetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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