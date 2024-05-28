package default_packages;

public class Constructor {
	
	
	//no need to call constructor will execute automatically when we create a object
	//	it will support overloading not overriding	
	public  Constructor() 
	{
		this("Parameter");
		System.out.println("This is a normal constructor");
	}
	
	public Constructor(String s) 
	{
		this("parameter", 2);
		System.out.println("This is a constructor with "+s);
	}
	public  Constructor(String s,int a) 
	{
		this("parameter",3,a);
		System.out.println("This is a constructor with "+s+a);
	}
	public  Constructor(String s,int a,int b) 
	{
		System.out.println("This is a constructor with "+s+a);
	}
	
	public static void main(String[] args) {
		
		Constructor C=new Constructor();
		
	}

}
