class MyThread implements Runnable {
	
	public void run() {

		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());
	}
}

class Main {
	
	public static void main(String[] args) {
		
		System.out.println("In Main");
		System.out.println(Thread.currentThread().getName());
		
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
	}
}
