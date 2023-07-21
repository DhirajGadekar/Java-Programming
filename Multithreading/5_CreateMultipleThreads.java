class MyThread1 extends Thread {
	
	public void run() {
		
		System.out.println("MyThread1 Name : " + Thread.currentThread().getName());
	}
}

class MyThread2 extends Thread {
	
	public void run() {
		
		System.out.println("MyThread2 Name : " + Thread.currentThread().getName());

		MyThread1 obj = new MyThread1();
		obj.start();
	}
}

class Main {

	public static void main(String[] args) {

		System.out.println("Main Name : " + Thread.currentThread().getName());

		MyThread2 obj = new MyThread2();
		obj.start();
	}
}
