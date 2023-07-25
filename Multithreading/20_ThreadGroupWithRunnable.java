class MyThread implements Runnable {
	
	public void run() {
		
		System.out.println(Thread.currentThread());
	}
}

class Main {
	
	public static void main(String[] args) {
		
		ThreadGroup threadGP = new ThreadGroup("C2W");

		MyThread obj = new MyThread();

		Thread t1 = new Thread(threadGP,obj,"C");
		Thread t2 = new Thread(threadGP,obj,"CPP");
		Thread t3 = new Thread(threadGP,obj,"JAVA");

		t1.start();
		t2.start();
		t3.start();
	}
}
