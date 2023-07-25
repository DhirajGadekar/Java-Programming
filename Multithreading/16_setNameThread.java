class MyThread extends Thread {
	
	MyThread() {

	}
	MyThread(String str) {
		
		super(str);
	}
	public void run() {

		System.out.println(getName());
	}
}

class Main {
	
	public static void main(String[] args) {
		
		MyThread obj1 = new MyThread("C2W");
		obj1.start();
		
		MyThread obj3 = new MyThread("C2W");
		obj3.start();

		MyThread obj2 = new MyThread();
		obj2.start();

		System.out.println(Thread.currentThread().getName());
	}
}
