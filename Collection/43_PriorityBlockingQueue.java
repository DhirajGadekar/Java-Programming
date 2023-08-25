import java.util.concurrent.*;

class BlockingQueueDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue bQueue = new PriorityBlockingQueue();

		bQueue.offer("Badhe");
		bQueue.offer("Kanha");
		bQueue.offer("Rahul");
		bQueue.offer("Ashish");

		System.out.println(bQueue);

		bQueue.offer("Shashi",5, TimeUnit.SECONDS);

		System.out.println(bQueue);

		System.out.println(bQueue.remainingCapacity());

		bQueue.take();

		System.out.println(bQueue);
	}
}
