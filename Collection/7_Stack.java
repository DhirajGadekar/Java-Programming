import java.util.*;

class StackMethods {
	
	public static void main(String[] args) {
			
		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s);

		System.out.println(s.pop()); 

		System.out.println(s.peek());

		System.out.println(s.search(20));
	}
}
