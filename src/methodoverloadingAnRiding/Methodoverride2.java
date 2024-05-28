package methodoverloadingAnRiding;

public class Methodoverride2 extends Methodoverride1 {
	
	public void override() 
	{
	
		super.override();
		System.out.println("This is method override2");

	}

	public static void main(String[] args) {
		
		Methodoverride2 m2=new Methodoverride2();
		
		m2.override();
		
	}
}
