package com.hcl;

import java.util.Scanner;

public class WicketDetailsMain {

	public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of Wickets");
        n=s.nextInt();
		WicketDetails w[]=new WicketDetails[n];
		
		long over;
		long ball;
		String wicketType;
		String playerName;
		String bowlerName;

		for(int i=0;i<n;i++) {
			System.out.println("Enter the player "+(i+1)+" details");

			System.out.println("Over:");
			over=s.nextLong();
			s.nextLine();
			System.out.println("ball:");
			ball=s.nextLong();
			s.nextLine();
			System.out.println("WicketType:");
			wicketType=s.nextLine();
			System.out.println("playerName:");
			playerName=s.nextLine();
			System.out.println("bowlerName:");
			bowlerName=s.nextLine();
			w[i]=new WicketDetails(over, ball, wicketType, playerName, bowlerName);
		}
		System.out.println("The Player Details are:");
		for(WicketDetails w1:w) {
			System.out.println(w1.getOver()
			+"\t"+w1.getBall()+"\t"
			+w1.getWicketType()+"\t"+w1.getPlayerName()+"\t"
			+w1.getBowlerName()+"\t");

		}





	}

}
