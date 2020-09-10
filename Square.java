package abs;

public class Square extends Shape {
	private float side;
	@Override
	public Double calculatePerimeter(float side) {
		Double AreaOfSquare=(double) (4*side);
		System.out.println("Area of Square:"+AreaOfSquare);
		return AreaOfSquare;
	}

	@Override
	public Double calculatePerimeter(float radius, float length, float breadth, float side) {
		// TODO Auto-generated method stub
		return null;
	}


}
