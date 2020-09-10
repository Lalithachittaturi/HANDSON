package Inheritance;

public class Circle extends Shape {
	private double radius;
	public void computeArea(double radius) {
		double AreaOfTheCircle=(22/7)*(radius*radius);
		System.out.println("Area of Circle:"+AreaOfTheCircle);
	}

}
