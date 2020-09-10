package abs;

import java.util.Scanner;

public class Exhibition extends Event{
	int noOfStall;
	public Exhibition() {

	}
	public Exhibition(String name, String details, String ownerName) {
		super(name, details, ownerName);
		// TODO Auto-generated constructor stub
	}
	public int getNoOfStall() {
		return noOfStall;
	}
	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}
	public double ProjectedRevenue(int noOfStall) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of stalls:");
		noOfStall=s.nextInt();
		return 1000*noOfStall;
		//return noOfStall;

	}
}
