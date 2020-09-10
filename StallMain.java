package Inheritance;

import java.util.Scanner;

public class StallMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stall s=new Stall();
		Scanner sc=new Scanner(System.in);
		String name;
		String detail;
		String ownername;
		String tv;
		System.out.println("enter the name of the stall:");
		name=sc.nextLine();
		System.out.println("enter the detail of the stall:");
		detail=sc.nextLine();
		System.out.println("enter the ownername of the stall:");
		ownername=sc.nextLine();
		System.out.println("enter the type of the stall:");
		String stallType = sc.nextLine();
		System.out.println("enter the size of the stall in square feet:");
		int squareFeet=sc.nextInt();
		System.out.println("enter the number of TV:");
		int noOfTv=sc.nextInt();
		
		System.out.println("Does have a TV??");
		tv=sc.nextLine();		
		
		System.out.println("The cost of the stall is:"+s.computeCost(stallType,squareFeet, noOfTv));

	}
}


