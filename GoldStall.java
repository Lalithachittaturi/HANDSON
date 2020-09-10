package handson;

import java.util.Scanner;

public class GoldStall implements Stall {
	private String StallName;
	private String OwnerName;
	private int Cost;
	private int tvSet;
	public GoldStall() {
		
	}

	public GoldStall(String stallName, String ownerName, int cost, int tvSet) {
		super();
		StallName = stallName;
		OwnerName = ownerName;
		Cost = cost;
		this.tvSet = tvSet;
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

	public int getTvSet() {
		return tvSet;
	}

	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
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
		System.out.println("enter Number of Tv sets:");
		tvSet=sc.nextInt();
	}

}
