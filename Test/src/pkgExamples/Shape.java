package pkgExamples;

public abstract class Shape {
	public int iColor = 9;
	public abstract double calculateArea();
	public int getIColor()
	{
		return this.iColor;
	}
	public void setIColor(int newIColor)
	{
		this.iColor = newIColor;
	}
}
