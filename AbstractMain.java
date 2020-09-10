package abs;

import java.util.Scanner;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius;
		float length;
		float breadth;
		float side;

		Scanner s=new Scanner(System.in);
		Shape sh=new Circle();
		Shape sh1=new Rectangle();
		Shape sh2=new Square();
		//Circle c=new Circle();
		//Rectangle r=new Rectangle();
		//Square sq=new Square();

		System.out.println("enter shape:");

		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Square");
		System.out.println("4. Invalid Choice");

		int ch=s.nextInt();
		if(ch==1) {

			System.out.println("enter circle area:");
			System.out.println("Enter the radius");
			radius = (float) s.nextDouble();
			sh.calculatePerimeter(radius);
		}
		if(ch==2) {

			System.out.println("enter rectangle area:");
			System.out.println("Enter the length and breadth:");
			length= (float) s.nextDouble();
			breadth= (float) s.nextDouble();
			sh1.calculatePerimeter(length,breadth);
		}


		if(ch==3) {

			System.out.println("enter square area:");
			System.out.println("Enter the side:");
			side= (float) s.nextDouble();
			sh2.calculatePerimeter(side);
		}
		if(ch==4) {
			System.out.println("Invalid Choice");
		}
	}

}
