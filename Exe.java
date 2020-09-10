package Exceptions;
import java.util.Scanner;
import java.io.*;
public class Exe {
	static int items;
	static int cost;
	static int cal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of items:");
		items=sc.nextInt();
		System.out.println("enter the value:");
		cost=sc.nextInt();
		try {
			cal=items/cost;
			System.out.println("enter the cost per day:"+cal);
		}
		catch(ArithmeticException ae) {
			System.out.println("Enter the correct value:");
		}
	}

}
