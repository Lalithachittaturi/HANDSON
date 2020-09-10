package handson;

import java.util.Scanner;

public class PremiumStall implements Stall {
	private String StallName;
	private String OwnerName;
	private int Cost;
	private int Projector;
	public PremiumStall() {
		
	}
	

	public PremiumStall(String stallName, String ownerName, int cost, int projector) {
		super();
		StallName = stallName;
		OwnerName = ownerName;
		Cost = cost;
		Projector = projector;
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


	public int getProjector() {
		return Projector;
	}


	public void setProjector(int projector) {
		Projector = projector;
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
		System.out.println("enter Projector:");
		Projector=sc.nextInt();
				
	}

}
