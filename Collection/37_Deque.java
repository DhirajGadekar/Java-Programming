import java.util.*;

class DequeDemo {
	
	public static void main(String[] args) {
		
		Deque que = new ArrayDeque();

		que.offer(10);
		que.offer(30);
		que.offer(40);
		que.offer(20);

		que.offerFirst(5);
		que.offerLast(50);
		System.out.println(que);

		System.out.println(que.peekFirst());
		System.out.println(que.peekLast());

		que.pollFirst();
		que.pollLast();
		System.out.println(que);
	}
}
