package Inheritance;

public class Rectangle extends Shape{
	private double length,breadth;
	public void computeArea(double length,double breadth) {
		double AreaOfReactangle=(length*breadth);
		System.out.println("Area of Reactangle:"+AreaOfReactangle);
	}

}
