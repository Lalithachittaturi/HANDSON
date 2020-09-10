package Inheritance;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double length;
		double breadth;
		double base;
		double heigth;

		Scanner s=new Scanner(System.in);
		Shape sh=new Shape();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();

		System.out.println("enter shape:");

		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("4. Invalid Choice");

		int ch=s.nextInt();
		if(ch==1) {

			System.out.println("enter circle area:");
			System.out.println("Enter the radius");
			radius = s.nextDouble();
			c.computeArea(radius);
		}
		if(ch==2) {

			System.out.println("enter rectangle area:");
			System.out.println("Enter the length and breadth:");
			length= s.nextDouble();
			breadth= s.nextDouble();
			r.computeArea(length,breadth);
		}


		if(ch==3) {

			System.out.println("enter triangle area:");
			System.out.println("Enter the base and heigth:");
			base= s.nextDouble();
			heigth= s.nextDouble();
			t.computeArea(base,heigth);
		}
		if(ch==4) {
			System.out.println("Invalid Choice");
		}
	}

}
