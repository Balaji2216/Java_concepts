package AbstractionAndInterface;

public class Abstractclass1 extends Abstractclass {

	@Override
	public void abstracts() {
		// TODO Auto-generated method stub
		System.out.println("This is abstraction method");	
	}

	public static void main(String[] args) {
		
		Abstractclass1 abc1=new Abstractclass1();
		abc1.abstracts();
		abc1.normal();
	}
}
