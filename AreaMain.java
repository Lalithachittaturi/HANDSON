package handson;
import java.util.Scanner;
public class AreaMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//AreaMain aa=new AreaMain();
		double length;
		double breadth;
		double side;
		System.out.println("enter the length & breadth of rectangle:");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		System.out.println("enter the side of Square:");
		side=sc.nextDouble();
		//Rectangle r=new Rectangle(length,breadth);
		//Square s=new Square(side);
		Polygon s1=new Rectangle(length, breadth);
		Polygon s2=new Square(side);
		s1.calcArea();
		s1.calcPeri();
		s2.calcArea();
		s2.calcPeri();
	}

}
