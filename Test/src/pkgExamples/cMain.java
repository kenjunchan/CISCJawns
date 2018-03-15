package pkgExamples;

public class cMain {

	public static void main(String[] args) {
		//create an object rectangle, with base 8.0 and height 9.5
		//print out the area of that rectangle
		Shape r1 = new Rectangle(8.0,9.5);
		System.out.println(r1.calculateArea());
		Triangle t2 = new Triangle(3.0,5.0);
		System.out.println((r1.calculateArea()) + (t2.calculateArea()));
		Shape c1 = new Circle();
		System.out.println(r1.getIColor());
		
		int a = 0;
		if(true && 9/2 == 9)
		{
			System.out.println("HI");
		}
		
		
	}

}
