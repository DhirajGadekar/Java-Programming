import java.util.*;

class CricPlayer {

	String name = null;
	int jerNo = 0;

	CricPlayer(String name, int jerNo) {
		
		this.name = name;
		this.jerNo = jerNo;
	}
	public String toString(){
		
		return jerNo + " : " + name;
	}
}
class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(new CricPlayer("Virat", 18));
		ll.add("Dhiraj");

		System.out.println(ll);
	}
}
