import java.util.*;

class ListIteratorCursor {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		ListIterator lItr = ll.listIterator();
		
		while(lItr.hasNext()) {
			
			System.out.println(lItr.next());
		}
	
		System.out.println(lItr.nextIndex());	
		System.out.println(lItr.previousIndex());	
		
		while(lItr.hasPrevious()) {
			
			System.out.println(lItr.previous());
		}
		System.out.println(lItr.nextIndex());	
		System.out.println(lItr.previousIndex());	

	}
}
