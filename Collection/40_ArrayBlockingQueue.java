import java.util.concurrent.*;
import java.util.*;

class BlockingQueueDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayBlockingQueue bQueue = new ArrayBlockingQueue(3);

		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);

		System.out.println(bQueue);
		
		bQueue.offer(40, 5, TimeUnit.SECONDS);

		System.out.println(bQueue);

		bQueue.take();

		System.out.println(bQueue);

		ArrayList al = new ArrayList();
		
		System.out.println("ArrayList : " + al);
		
		bQueue.drainTo(al);

		System.out.println("ArrayList : " + al);

		System.out.println(bQueue);
	}
}	
