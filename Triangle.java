package Inheritance;

public class Triangle extends Shape{
	private double base,height;
	public void computeArea(double base,double height) {
		double AreaOfTriangle=(0.5*(base*height));
		System.out.println("Area of Triangle:"+AreaOfTriangle);
	}

}
