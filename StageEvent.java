package abs;

import java.util.Scanner;

public class StageEvent extends Event{
	int noOfSeats;
	public StageEvent() {
		
	}
	public StageEvent(String name, String details, String ownerName) {
		super(name, details, ownerName);
		// TODO Auto-generated constructor stub
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double projectedRevenue(int noOfSeats) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of seats:");
		noOfSeats=s.nextInt();
		return 50*noOfSeats;
	
	}


}
