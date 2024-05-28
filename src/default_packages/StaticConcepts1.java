package default_packages;

public class StaticConcepts1 {
	
	static {
		
		System.out.println("static");
	}
	
	public static void main(String[] args) {
		
		System.out.println(i);
		add();
 
	}

	static int i;
	
	public static void add() {
		
		final int  j=100;
		System.out.println(j);

	}
}
