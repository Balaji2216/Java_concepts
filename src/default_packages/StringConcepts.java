package default_packages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringConcepts {
	
	public static void main(String[] args) {
		
		System.out.println("=========Immutable/Literals=========");//same memory for s and s1 due to values are duplicate
		String s="API";
		String s1="API";
		String s2="TESTING";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		s=s+s2;
		
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

		System.out.println("=========Mutable/Non Literals=========");//same memory for sb and after appending sb
		StringBuffer sb=new StringBuffer("Automation");
		StringBuffer sb1=new StringBuffer("Automation");
		StringBuffer sb2=new StringBuffer("Testing");
		
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		
		sb=sb.append(sb2);
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		String ss[]=new String[5];
		ss[1]="20";
		ss[2]="50";
		ss[3]="80";
		
		System.out.println(ss[2]);
		
		
//		List<Integer>i=new ArrayList<Integer>();
//		i.add(2);
//		i.add(3);
//		
//		System.out.println(i);
//		
//		for (Integer integer : i) {
//			System.out.println(integer);
//		}
//		
//		Set<Integer>j=new HashSet<Integer>();
//		j.add(20);
//		j.add(30);
//		
//		System.out.println(j);
//		
//		for (Integer integer : j) {
//			System.out.println(integer);
//
//		}
		
		
			
		
		
//			System.out.println(integer);
			
		

		
//		for (int i = 0; i <=3; i++) {
//			System.out.println(ss[i]);
//
//		}
//		for (String string : ss) {
//			System.out.println(string);
//		}
//		
//		int i[]=new int[5];
//		i[0]=10;
//		i[1]=20;
//		i[3]=30;
//		
//		System.out.println(i[3]);
//		
//		for (int j : i) {
//			System.out.println(j);
//			
//		}

	}
	
}
