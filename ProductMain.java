package com.hcl;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n;
		int min = 0;
		double discount,amount,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of product details:");
		//n=s.nextInt();
		Product p[]=new Product[2];

		int product_code;
		String product_name;
		double Price;
		int Stock;

		for(int i=0;i<p.length;i++) {


			System.out.println("Product "+(i+1)+" details");

			System.out.print("product_code:");
			product_code=s.nextInt();
			s.nextLine();
			System.out.print("product_name:");
			product_name=s.nextLine();
			//s.nextLine();
			System.out.print("Price:");
			Price=s.nextDouble();
			Product p1=new Product();

			System.out.print("Stock:");
			Stock=s.nextInt();
			s.nextLine();
			if(Price>=80000) {
				d=(30*Price)/100;
				Price=Price-d;}

			/*System.out.println("enter the discount percentage:");
			discount=s.nextDouble();
			price=price-discount;
			amount=(d*Price)/100;*/
			p[i]=new Product(product_code,product_name,Price,Stock);
			System.out.println("Amount after discount:"+Price);				
		}

		for(Product p11:p) {
			System.out.println("L & K SUPPLIERS ARE:");

			System.out.println("PRODUCT CODE:"+p11.getProduct_code()
			+"\n"+"PRODUCT NAME:"+p11.getProduct_name()+"\n"
			+"PRICE:"+p11.getPrice()+"\n"+"STOCK:"+p11.getStock());
		}
		if(p[0].getPrice()>p[1].getPrice()) {
			System.out.println("product one is high");
		}else {
			System.out.println("product two is high");

		}
		for(int i=0;i<p.length-1;i++) {

		for(int j=i+1;j<=p.length;j++) {
			if(p[i].getStock()<p[j].getStock()) {
				min = i;
			}
		} 
			
		}System.out.println("minimun"+min);


	}
}

