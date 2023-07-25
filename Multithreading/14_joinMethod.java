class MyThread extends Thread {
	
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(getName());
		}
	}
}

class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		obj1.start();
		obj2.start();

		obj1.join();
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
	}
}
