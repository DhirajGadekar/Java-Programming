import java.util.*;

class DictionaryMethods {
	
	public static void main(String[] args) {
		
		Hashtable map = new Hashtable();

		map.put(10, "Sachin");
		map.put(7, "MSD");
		map.put(45, "Rohit");
		map.put(18, "Virat");
		map.put(1, "KLRahul");
		
		System.out.println(map);
		
		// 1) boolean isEmpty()
		System.out.println(map.isEmpty());

		// 2) Enumeration<K> keys();

		Enumeration itr1 = map.keys();
		while(itr1.hasMoreElements()) {

			System.out.println(itr1.nextElement());			
		}

		// 3) Enumeration elements();

		Enumeration itr2 = map.elements();
		while(itr2.hasMoreElements()) {

			System.out.println(itr2.nextElement());			
		}

		// 4) V get(Object);
		System.out.println(map.get(10));
		
		// 5) V remove(Object)
		map.remove(1);
		System.out.println(map);
	}
}
