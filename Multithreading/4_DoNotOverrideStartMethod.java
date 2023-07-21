class MyThread extends Thread {
	
	public void run() {
		
		System.out.println("MyThread Name : " + Thread.currentThread().getName());
	}
	//Start Method do not override because it is start the running new child thread
	public void start() {
		
		run();
		System.out.println("My Start Method");
	}
}
class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Main Name : " + Thread.currentThread().getName());
		
		MyThread obj = new MyThread();
		obj.start();
	}
}
