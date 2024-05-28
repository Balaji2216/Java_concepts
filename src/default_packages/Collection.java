package default_packages;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Collection {

	public static void main(String[] args) {
		
		System.out.println("----------------LIST Method is index based and allows duplicates-----------------");

		List<Integer> L = new ArrayList<Integer>();//Insertion order
		L.add(1);
		L.add(2);
		L.add(2);//It allows duplicates

		System.out.println(	L.get(1));// Index is Parameter

		System.out.println(L);

		List<Integer> L1 = new LinkedList<Integer>();//Insertion order
		L1.add(11);
		L1.add(22);

		System.out.println(L.get(1));// Index is Parameter

		System.out.println(L);

		List<Integer> L2 = new Vector<Integer>();//Insertion order
		L2.add(111);
		L2.add(222);

		System.out.println(L.get(1));// Index is Parameter

		System.out.println(L);

		System.out.println("--------------- SET Method is value based and not allows duplicates-----------------");

		Set<Integer> s = new HashSet<Integer>();
		s.add(4);
		s.add(4);//It doesn't allow duplicates
		s.add(5);

		// We cant able to get in the Set method for single value

		System.out.println(s);

		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(44);
		s1.add(55);

		// We cant able to get in the Set method for single value

		System.out.println(s1);

		Set<Integer> s2 = new TreeSet<Integer>();
		s2.add(44);
		s2.add(55);

		// We cant able to get in the Set method for single value

		System.out.println(s2);

		System.out.println("--------------- MAP Method is Key + Value pair-----------------");

		// Map<Key, Value>
		Map<String, Integer> p = new HashMap<String, Integer>();
		p.put("ajay", 1);
		p.put("vijay", 2);
		p.put("ajay", 3);

		System.out.println(p.get("ajay"));// Key is Parameter

		System.out.println(p);

		Map<String, Integer> p1 = new LinkedHashMap<String, Integer>();
		p1.put("vijay", 11);
		p1.put("vijay", 22);
		p1.put("ajay", 33);

		System.out.println(p1.get("ajay"));// Key is Parameter

		System.out.println(p1);

		Map<String, Integer> p2 = new TreeMap<String, Integer>();

		p2.put("vijay", 111);
		p2.put("vijay", 222);
		p2.put("ajay", 333);

		System.out.println(p2.get("ajay"));// Key is Parameter

		System.out.println(p2);

		Map<String, Integer> p3 = new Hashtable<String, Integer>();

		p3.put("vijay", 1111);
		p3.put("vijay", 2222);
		p3.put("ajay", 3333);

		System.out.println(p3.get("ajay"));// Key is Parameter

		System.out.println(p3);

		Map<String, Integer> p4 = new ConcurrentHashMap<String, Integer>();

		p4.put("vijay", 11111);
		p4.put("vijay", 22222);
		p4.put("ajay", 33333);

		System.out.println(p4.get("ajay"));// Key is Parameter

		System.out.println(p4);

		Set<Entry<String, Integer>> entrySet = p4.entrySet();	
		System.out.println(entrySet); 
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);	
			
			
			String ss1=null;
			System.out.println(ss1);
			
			char charAt = ss1.charAt(0);
			System.out.println(charAt);


	}

}
	
}
