import java.util.*;

class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();

		pq.offer("Shashi");
		pq.offer("Ashashi");
		pq.offer("Rahul");
		pq.offer("Badhe");
		pq.offer("Kanha");

		System.out.println(pq);
	}
}
