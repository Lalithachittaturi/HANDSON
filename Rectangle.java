package handson;
import java.util.Scanner;
class Rectangle implements Polygon {
	public double length;
	public double breadth;
	Scanner sc=new Scanner(System.in);
	
		public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
		@Override
	public double calcArea() {
		/*System.out.println("enter the length & breadth of rectangle:");
		length=sc.nextDouble();
		breadth=sc.nextDouble();*/
		double AreaOfRectangle=(length*breadth);
		System.out.println("Area of Reactangle:"+AreaOfRectangle);
		return AreaOfRectangle;}
	@Override
	public double calcPeri() {
		/*System.out.println("enter the length & breadth of rectangle:");
		length=sc.nextDouble();
		breadth=sc.nextDouble();*/
		double PeriOfReactangle=(2*(length+breadth));
		System.out.println("perimeter of Reactangle:"+PeriOfReactangle);
		return PeriOfReactangle;	}}
