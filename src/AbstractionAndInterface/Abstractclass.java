package AbstractionAndInterface;

public abstract class Abstractclass {
	
	//Hiding of an implementation part
	//implementation part is given inside the method block
	//	Types - partial (Abstract class) or fully abstraction(Interface).
	
	public  void normal() 
	{
	System.out.println("This is normal method");	
	}
	
	public abstract void abstracts();

}

//Abstract class
//it supports both abstract and non abstract method(
//we cant able to create object in abstract class due to there is no implementation part
