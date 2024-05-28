package methodoverloadingAnRiding;

	// Its a Method overloading method			
	// Its also known as compile time polymorphism or static binding

public class Polymorphism {

	// Method name should be same but parameters or arguments will be different
	// Datatypes will be differ
	// Datatypes count will be differ
	// Datatypes order will be differ

	public void name(String s, int a) 
	
	{
		System.out.println(s+" age is " + a);
	}

	public void name(int a, int b)

	{
		System.out.println("age is " + a + "then" + b);
	}

	public void name(int a, String s) 
	
	{
		System.out.println("age is " + a);
	}

	public static void main(String[] args) 
	
	{
		
		Polymorphism P = new Polymorphism();

		P.name("My daughter",10);
		P.name(0, 10);
		P.name(20, null);
	}
}
