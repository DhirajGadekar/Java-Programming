
class MyThread implements Runnable {
	
	public void run() {
		
		System.out.println("MyThread Name : " + Thread.currentThread().getName());
	}
}

class Main {
	
	public static void main(String[] args) {
		
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		try {
			
			t.start();
		} catch(IllegalThreadStateException its) {

			//The start method throws an exception if the method is called a second time on the same object.
			System.out.println("Exception Handled");
		}
	}
}
