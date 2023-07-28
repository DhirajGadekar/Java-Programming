import java.util.concurrent.*;

class MyThread implements Runnable {
	
	int num;
	MyThread(int num) {
		
		this.num = num;
	}

	public void run() {
		
		System.out.println(Thread.currentThread() + " Start : " + num);
		dailyTask();
		System.out.println(Thread.currentThread() + " End : " + num);
	}
	void dailyTask() {
		
		try {

			Thread.sleep(1000);
		} catch(InterruptedException ie) {
			

		}
	}
}

class Main {
	
	public static void main(String[] args) {
		
		ThreadPoolExecutor tes = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);

		for(int i = 1; i < 5; i++) {
			
			MyThread obj = new MyThread(i);
			tes.execute(obj);
		}
		System.out.println(tes.getMaximumPoolSize());
		System.out.println(tes.allowsCoreThreadTimeOut());	
		System.out.println(tes.getMaximumPoolSize());
		tes.shutdown();
	}
}
