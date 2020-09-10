package abs;

import java.util.Scanner;
public class EventMain {
	private static int noOfStall;
	private static int noOfSeats;

	public static void main(String args[]) {
		Event e=new Event();
		Scanner s=new Scanner(System.in);
		String name;
		String details;
		String ownername;
		int noOfStalls = 0;
		int noOfSeats = 0;
		System.out.println("enter the name of the event:");
		name=s.nextLine();
		System.out.println("enter the details of the event:");
		details=s.nextLine();
		System.out.println("enter the ownername of the event:");
		ownername=s.nextLine();
		System.out.println("enter the type of the event:");
		System.out.println("1.EXHIBITION");
		System.out.println("2.STAGE-EVENT");
		Exhibition ex=new Exhibition();
		StageEvent se=new StageEvent();

		int ch=s.nextInt();
		if(ch==1) {
			System.out.println("Projected Revenue of the event:"+ex.ProjectedRevenue(noOfStall*1000));
		}
		if(ch==2) {
			int p;
			System.out.println("Projected Revenue of the event:"+se.projectedRevenue(noOfSeats*50));	
		}
	}
}
