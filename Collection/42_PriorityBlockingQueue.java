import java.util.concurrent.*;

class BlockingQueueDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue bQueue = new PriorityBlockingQueue(1);

		bQueue.offer(40);
		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);
		
		System.out.println(bQueue);

		bQueue.offer(50,5, TimeUnit.SECONDS);

		System.out.println(bQueue);

		System.out.println(bQueue.remainingCapacity());

		bQueue.take();

		System.out.println(bQueue);
	}
}
