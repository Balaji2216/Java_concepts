package methodoverloadingAnRiding;

public class Methodoverride1 extends Methodoverride  {
	
	public void override() 
	{
		super.override();
		super.override("This is also method ovrride using parameter method");
		System.out.println("This is method override1");
	}
	
	public static void main(String[] args) 
	{
	
		Methodoverride1 m1=new Methodoverride1();
		m1.override();
		
		
	}


}
