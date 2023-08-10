import java.util.*;

class TreeSetMethods {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();

		ts.add("Kanha");
		ts.add("Ashish");
		ts.add("Shashi");
		ts.add("Kanha");
		ts.add("Rahul");
		ts.add("Badhe");
		ts.add("Badhe");

		System.out.println(ts);
		// 1) public java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
		System.out.println(ts.subSet("Kanha", false, "Shashi", true));
		System.out.println(ts.subSet("Ashish", true, "Kanha", true));

  		// 2) public java.util.NavigableSet<E> headSet(E, boolean);
  		System.out.println(ts.headSet("Kanha", true));

		// 3) public java.util.NavigableSet<E> tailSet(E, boolean);
  		System.out.println(ts.tailSet("Kanha", false));
		
		// 4) public java.util.SortedSet<E> subSet(E, E);
  		System.out.println(ts.subSet("Ashish", "Kanha"));
		
		// 5) public java.util.SortedSet<E> headSet(E);
  		System.out.println(ts.headSet("Shashi"));
  		
		// 6) public java.util.SortedSet<E> tailSet(E);
  		System.out.println(ts.tailSet("Rahul"));
  		
		// 7) public E first();
		System.out.println(ts.first());
  		
		// 8) public E last();
		System.out.println(ts.last());
  		
		// 9) public E lower(E);
  		System.out.println(ts.lower("Shashi"));

		// 10) public E floor(E);
		System.out.println(ts.floor("Kanha"));
 	 	
		// 11) public E ceiling(E);
		System.out.println(ts.ceiling("Shashi"));
  		
		// 12) public E higher(E);
  		System.out.println(ts.higher("Ashish"));
		// 13) public E pollFirst();
  		System.out.println(ts.pollFirst());
		System.out.println(ts);

		// 14) public E pollLast()
		System.out.println(ts.pollLast());	
		System.out.println(ts);
	}
}
