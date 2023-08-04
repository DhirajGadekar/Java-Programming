import java.util.*;

class ArrayListMethods extends ArrayList{
	
	public static void main(String[] args) {
		
		ArrayListMethods al = new ArrayListMethods();

		// 1) boolean add(E);
		al.add(10);
		al.add("Dhiraj");
		al.add("Dhiraj");
		al.add(20.5f);
		al.add(10);

		System.out.println(al);

		// 2) void add(int, E);

	        al.add(3,"Core2Web");	
		System.out.println(al);

		// 3) public int size();
 		
		System.out.println(al.size());

  		// 4) public boolean isEmpty();
		System.out.println(al.isEmpty());

		// 5) boolean contains(Object);
		System.out.println(al.contains("Dhiraj"));
		System.out.println(al.contains(23));

		// 6) int indexOf(Object);
		System.out.println(al.indexOf(10));

		// 7) int lastIndexOf(Object);
		System.out.println(al.lastIndexOf(10));

		// 8) E get(int);
		System.out.println(al.get(5));

		// 9) E set(3,E);
		System.out.println(al.set(2,"Gadekar"));
		System.out.println(al);

		ArrayList al2 = new ArrayList();
		al2.add("salman");
		al2.add("shahrukh");
		al2.add("Amir");
		
		// 10) boolean addAll(Collection);
		al.addAll(al2);
		System.out.println(al);

		// 11) boolean addAll(int, Collection);
		al.addAll(3, al2);
		System.out.println(al);
		
		// 12) void removeRange(int, int);
		al.removeRange(3, 6);
		System.out.println(al);

		// 13) E remove(int);
		System.out.println(al.remove(6));
		System.out.println(al);

		// 14) boolean remove(Object);
		System.out.println(al.remove("Amir"));
		System.out.println(al.remove("salman"));
		System.out.println(al);

		// 15) Object[] toArray();
		Object arr[] = al.toArray();

		for(Object data : arr) {
			
			System.out.print(data + " ");
		}
		System.out.println();

		// 16) boolean removeAll(Collection);
		System.out.println(al.removeAll(al2));
		System.out.println(al);
		
		al2.add("Dhiraj");
		al2.add("Gadekar");
		al2.add(10);
		// 17) boolean retainAll(Collection);
		System.out.println(al.retainAll(al2));
		System.out.println(al);

		// 18) int hashCode();
		System.out.println(al.hashCode());

		// 19) Object clone();
		ArrayList al3 = (ArrayList)al.clone();
		System.out.println(al3);

		// 20) boolean equals(Object);
		System.out.println(al);
		System.out.println(al3);
		System.out.println(al.equals(al3));
		
 		// 21) void clear();
		al.clear();
		System.out.println(al);	
	}
}
