class MyThread extends Thread {
	
	static Thread nmMain = null;
	public void run() {

		try {
			
			nmMain.join();
		} catch(InterruptedException obj) {
			
			System.out.println("Exception Occure");
		}
		System.out.println("In Thread-0");
	}
}
class Main {
	
	public static void main(String[] args) {
		
		MyThread.nmMain = Thread.currentThread();

		MyThread obj = new MyThread();
		obj.start();
		
		try {
			
			obj.join();
		} catch(InterruptedException ie) {
			
			System.out.println("Exception Occure");
		}

		System.out.println("IN Main");
	}
}
