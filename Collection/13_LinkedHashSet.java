import java.util.*;

class LinkedHashSetMethods {
	
	public static void main(String[] args) {
		
		LinkedHashSet lh = new LinkedHashSet();

		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(40);
		lh.add(40);

		System.out.println(lh);
	}
}
