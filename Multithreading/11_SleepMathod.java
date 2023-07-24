class MyThread extends Thread {

	public void run() {
		
		for(int i = 0;i < 10; i++) {
			
			System.out.println("In Thread-0");

			try {
				
				Thread.sleep(1000,500000);
			} catch(InterruptedException obj) {
				
				System.out.println("Exception Occure");
			}
		}
	}
}

class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread obj = new MyThread();
		obj.start();

		for(int i = 0;i < 10; i++) {
			
			System.out.println("In Main");
			Thread.sleep(1000);
		}
	}
}
