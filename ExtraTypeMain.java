package com.hcl;

import java.util.Scanner;

public class ExtraTypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String name;
		String runs;
		
		System.out.println("Enter the Extra Type details:");
		String str=in.nextLine();
		String arr[]=str.split("#");
		name=arr[0];
		runs=arr[1];
		
		System.out.println("Extra Details\n"+"Extra Type:"+arr[0]+"\nRuns:"+arr[1]);
	}

}

