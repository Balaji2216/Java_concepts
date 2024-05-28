package default_packages;

public class Variabletypes {
	
	int i=10;
	
	private void add() {

		int i=20;
		int j=30;
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		
		Variabletypes V=new Variabletypes();
		V.add();
		
		for (int i = 0; i <=10; i++) {
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}

}
