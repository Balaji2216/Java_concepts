package methodoverloadingAnRiding;

public class Methodoverride {

	// Class name are different but method,parameter are same
	//	Its also known as runt time polymorphism or dynamic binding
	//	Its also know as run time polymorphism or dynamic binding
	//	super keyword is used for parent class reference

	public void override() 
	
	{
		System.out.println("This is method override");
	}
	
	public void override(String s)
	
	{
		System.out.println(s);
	}

}
