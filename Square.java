package handson;
import java.util.Scanner;
public class Square implements Polygon {
	Scanner sc=new Scanner(System.in);
	double side;
		public Square(double side) {
		super();
		this.side = side;
	}
		@Override
	public double calcArea() {
		/*System.out.println("enter the side of Square:");
		side=sc.nextDouble();*/
		Double AreaOfSquare=4*side;
		System.out.println("Area of Square:"+AreaOfSquare);
		return AreaOfSquare;}
	@Override
	public double calcPeri() {
		/*System.out.println("enter the side of Square:");
		side=sc.nextDouble();*/
		Double PerimeterOfSquare=side*side;
		System.out.println("Area of Square:"+PerimeterOfSquare);
		return PerimeterOfSquare;}
}
