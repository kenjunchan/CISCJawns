package pkgExamples;

public class Triangle extends Shape{
	//declare two private double attributes, base and height
	//create a constructor that initializes base and height given two double values
	//write a calculateArea method that calculates and returns the area of the triangle
	private double base;
	private double height;
	public Triangle(double b, double h)
	{
		base = b;
		height = h;
	}
	public double calculateArea()
	{
		return ((base * height) / 2);
	}
	public void printiColor()
	{
		System.out.println(iColor);
	}
	public double getBase()
	{
		return base;
	}
}
