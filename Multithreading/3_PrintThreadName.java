class MyThread extends Thread {
	
	public void run() {
		
		System.out.println("Child Thread : " + Thread.currentThread().getName());
	}
}
class Main {
	
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread : " + Thread.currentThread().getName());

		MyThread obj1 = new MyThread();
		obj1.start();

		MyThread obj2 = new MyThread();
		obj2.start();
	}
}
