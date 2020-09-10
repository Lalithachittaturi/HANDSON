package com.hcl;

import java.util.Scanner;

public class ProductDetails {
	public void show() {
		double discount,amount,d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the discount percentage:");
		System.out.print("Price:");
		double Price = s.nextDouble();
		discount=s.nextDouble();
		d=100-discount;
		amount=(d*Price)/100;
		System.out.println("Amount after discount:"+amount);				


	}

}
