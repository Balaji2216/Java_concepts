package default_packages;

public class ReturnType {
	
	//normal method and static method
	
	private static int add(int a,int b) {
		return a+b;

	}
	public static void main(String[] args) {
//		ReturnType r=new ReturnType();
//		int sum=r. add(10,20);
		int sum=add(10,20);
		System.out.println(sum);
	}
}
