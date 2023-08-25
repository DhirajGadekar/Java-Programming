import java.util.*;

class DequeDemo extends ArrayDeque {
	
	public static void main(String[] args) {
		
		ArrayDeque que = new ArrayDeque();

		que.offer(10);
		que.offer(30);
		que.offer(40);
		que.offer(20);

		que.inc(2,5,3);
	}
}
