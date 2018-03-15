package pkgExamples;

public class Rectangle extends Shape{
	private double base;
	private double height;
	
	
	
	
	
	
	
	
	
	
	
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(double b, double h)
	{
		base = b;
		height = h;
	}
	
	
	
	
	
	
	
	
	
	public void baseTimesNumber(int n)
	{
		this.base = this.base * n;
	}
	public double calculateArea() 
	{
		return base*height;
	}
	public double calculatePerimeter()
	{ 
		return (2 * base) + (2 * height);
	}
}
