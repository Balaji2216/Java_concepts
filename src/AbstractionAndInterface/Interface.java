package AbstractionAndInterface;

public class Interface implements Infclass,Infclass2{

	@Override
	public void method1() {
		System.out.println("This is method1");
	}

	@Override
	public void method2() {
		System.out.println("This is method2");
	}

	@Override
	public void method3() {
		System.out.println("This is method3");
	}

	@Override
	public void method4() {
		System.out.println("This is method4");
	}
	
	public static void main(String[] args) {
		Interface I=new Interface();
		I.method1();
		I.method2();
		I.method3();
		I.method4();
	}
}
