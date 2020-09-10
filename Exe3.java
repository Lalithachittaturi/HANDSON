package Exceptions;
import java.util.Scanner;
public class Exe3 {
	public static void main(String s[]) {
		//int a;
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the value");
		int a=sc.nextInt();
		System.out.println("Entered value is:"+a);
		}
		catch(Exception e) {
			System.out.println("enter proper value");
		}
		
	}

}
