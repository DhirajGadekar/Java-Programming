import java.util.*;

class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue que = new LinkedList();

		que.offer(10);
		que.offer(20);	
		que.offer(50);
		que.offer(30);
		que.offer(40);

		System.out.println(que);
		
		// 1) peek();
		System.out.println(que.peek());

		// 2) element();
		System.out.println(que.element());   // throws NoSuchElementException

		// 3) poll();
		que.poll();
		System.out.println(que);

		// 4) remove()
		que.remove();
		System.out.println(que);                // throws NoSuchElementException
	}
}
