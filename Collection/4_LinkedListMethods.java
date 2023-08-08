import java.util.*;

class CricPlayer {
	
	String name = null;
	int jerNo = 0;
	CricPlayer(String name, int jerNo) {
		
		this.name = name;
		this.jerNo = jerNo;
	}
	public String toString() {
		
		return jerNo + " : " + name;
	}
}	
class LinkedListMethods {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();

		// 1) public boolean add(E);
		ll.add(10);
		ll.add(new CricPlayer("Rohit", 45));

		// 2) public void addFirst(E);
		ll.addFirst(5);

		// 3) public void addLast(E);
		ll.addLast(20);

		// 4) public void add(int, E);
		ll.add(2, 15);

		System.out.println(ll);

		// 5) public E get(int);
		System.out.println(ll.get(3));

		// 6) public E set(int, E);
		System.out.println(ll.set(2, "Dhiraj"));
		System.out.println(ll);

		// 7) public boolean contains(java.lang.Object);
		System.out.println(ll.contains(10));
		System.out.println(ll.contains(ll.get(3)));

		LinkedList ll2 = new LinkedList();
		ll2.add("Core2Web");
		ll2.addLast("Incubator");
		// 8) public boolean addAll(java.util.Collection<? extends E>);
		ll.addAll(ll2);
		System.out.println(ll);

		// 9) public boolean addAll(int, java.util.Collection<? extends E>);
		ll.addAll(0,ll2);
		System.out.println(ll);

		// 10) public int indexOf(java.lang.Object);
		System.out.println(ll.indexOf("Core2Web"));

		// 11) public int lastIndexOf(java.lang.Object);
		System.out.println(ll.lastIndexOf("Core2Web"));

		// 12) public E peek();
		System.out.println(ll.peek());

		// 13) public E element();
		System.out.println(ll.element());

		// 14) public E poll();
		System.out.println(ll.poll());
		System.out.println(ll);	
	}
}	
