package com.hcl;

import java.util.Scanner;
public class Sample {

	public static void main(String args[]) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Films");
		n=s.nextInt();
		System.out.println("Enter the Film Details");
		n=s.nextInt();
		System.out.println("Enter the ");
		n=s.nextInt();
		System.out.println("Enter the number of Films");
		n=s.nextInt();
		WicketDetails w[]=new WicketDetails[n];
		
		String over;
		String ball;
		String wicketType;
		String playerName;
		String bowlerName;

		for(int i=0;i<n;i++) {
			System.out.println("Enter the player "+(i+1)+" details");

			System.out.println("Over:");
			over=s.nextLine();
			//s.nextLine();
			System.out.println("ball:");
			ball=s.nextLine();
			//s.nextLine();
			System.out.println("WicketType:");
			wicketType=s.nextLine();
			System.out.println("playerName:");
			playerName=s.nextLine();
			System.out.println("bowlerName:");
			bowlerName=s.nextLine();
			
			String txt=s.nextLine();
			String arr[]=txt.split(",");
			over=arr[0];
			ball=arr[1];
			wicketType=arr[2];
			playerName=arr[3];
			bowlerName=arr[4];
			//w[i]=new WicketDetails(over, ball, wicketType, playerName, bowlerName);
		}
		System.out.println("The Player Details are:");
		for(WicketDetails w1:w) {
			System.out.println(w1.getOver()
					+"\t"+w1.getBall()+"\t"
					+w1.getWicketType()+"\t"+w1.getPlayerName()+"\t"
					+w1.getBowlerName()+"\t");

		}


class WicketDetailsMain {
	private long over;
	private long ball;
	private String wicketType;
	private String playerName;
	private String bowlerName;

	public WicketDetailsMain(long over, long ball, String wicketType, String playerName, String bowlerName) {
		super();
		this.over = over;
		this.ball = ball;
		this.wicketType = wicketType;
		this.playerName = playerName;
		this.bowlerName = bowlerName;
	}
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public String getWicketType() {
		return wicketType;
	}
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
		}}}

