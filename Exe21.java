package Exceptions;
import java.util.Scanner;
import java.io.*;
public class Exe21 {
	public static void main(String s[]) throws IOException {
		String name;
		double deposit;
		double costPerDay;
		try {
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the item details:");
			System.out.println("enter name:");
			name=bf.readLine();
			System.out.println("enter deposit:");
			deposit=Integer.parseInt(bf.readLine());
			System.out.println("enter cost per day:");
			costPerDay=Integer.parseInt(bf.readLine());
			System.out.println("The details of the item are:");
			Exe2 ee=new Exe2(name,deposit,costPerDay);
			System.out.println("name:"+ee.getName());
			System.out.println("deposit:"+ee.getDeposit());
			System.out.println("costPerDay"+ee.getCostPerDay());
		}
		catch(NumberFormatException nfe) {
			System.out.println("enter proper value");
		}
		
	}

}

