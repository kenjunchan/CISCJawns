package pkgExamples;

public class ClassA 
{ 
	// Fields
	private int a; //Declaring a to be of type int
	public int b;
	String name; //Declaring name to be of type String
	
	public ClassA() // default Constructor
	{
		this.a = 0; // initializing a
		this.b = 0;
		this.name = "";
	}
	public ClassA(int new_A_Value) //overloaded Constructor
	{
		this.a = new_A_Value;
	}
	public ClassA(int new_A_Value, String new_String_Value) //overloadedConstructor
	{
		this.a = new_A_Value;
		this.name = new_String_Value;
	}
	public ClassA(String new_String_Value, int new_B_Value) //overloadedConstructor
	{
		this.name = new_String_Value;
		this.b = new_B_Value;
	}
	//Only ONE constructor is run, and it runs when you initialize any instance of ClassA
	public int getA()  // get method
	{
		return a;
	}
	public void setA(int aNew) // set method
	{
		this.a = aNew;
	}
	public int multiplyAByGivens(int x) // method
	{
		return this.a * x; 
	}
	public int multiplyAByGivens(int x, int y) // overloaded method
	{
		return this.a * x * y;
	}
	public void methodA(int n)
	{
		for(int i = 0; i < 5; i++)
		{
			this.a = this.a + n;
		}
		a = 20;
		while(a < 10)
		{
			this.a += 1;
		}
		
		do
		{
			this.a += 1;
			
		}while(a < 16);
	}
}
