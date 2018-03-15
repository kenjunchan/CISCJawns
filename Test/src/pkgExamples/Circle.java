package pkgExamples;

public class Circle extends Shape{
	private double radius;
	public Circle()
	{
		
	}
	public double calculateArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
}
