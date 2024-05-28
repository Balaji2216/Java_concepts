package default_packages;

public class Array {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		System.out.println(a[1]);	//to get single value
		
		int arr[]=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr);//Not possible
		
		System.out.println(arr.length);
		
		//To get all values
		
		//1.Normal for loop
		
		for (int i = 0; i <= 3; i++) {
			System.out.println(a[i]);
		}
		
		//2.enhanced for each
		
		for (int i : arr) {
			System.out.println(i);

		}

		
		String[] s=new String[10];//sting we can give alpha numeric letter and numbers
}
	}
	
	
