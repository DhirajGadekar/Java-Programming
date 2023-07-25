class MyThread implements Runnable {
	
	public void run() {

		System.out.println(Thread.currentThread().getName());
	}
}

class Main {
	
	public static void main(String[] args) {
		
		MyThread obj = new MyThread();
		Thread t = new Thread(obj,"C2W");
		t.start();

		System.out.println(Thread.currentThread().getName());
	}
}
