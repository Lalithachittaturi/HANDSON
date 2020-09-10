package handson;

import java.util.Scanner;

public class ExecutiveStall implements Stall {
	private String StallName;
	private String OwnerName;
	private int Cost;
	private int Screen;
	public ExecutiveStall() {
		
	}
	public ExecutiveStall(String stallName, String ownerName, int cost, int screen) {
		super();
		StallName = stallName;
		OwnerName = ownerName;
		Cost = cost;
		Screen = screen;
	}
	public String getStallName() {
		return StallName;
	}
	public void setStallName(String stallName) {
		StallName = stallName;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public int getCost() {
		return Cost;
	}
	public void setCost(int cost) {
		Cost = cost;
	}
	public int getScreen() {
		return Screen;
	}
	public void setScreen(int screen) {
		Screen = screen;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Stall name:");
		StallName=sc.nextLine();
		System.out.println("enter Owner name:");
		OwnerName=sc.nextLine();
		System.out.println("enter Cost:");
		Cost=sc.nextInt();
		System.out.println("enter Screen:");
		Screen=sc.nextInt();
	}

}
