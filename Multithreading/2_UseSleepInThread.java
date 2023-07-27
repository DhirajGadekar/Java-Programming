class MyThread extends Thread {
	
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("In run");
			try {
				
				Thread.sleep(10);
			} catch(InterruptedException obj) {
				
				System.out.println("Exception Handled");
			}
		}
	}
}
class Main {
	
	public static void main(String[] args) {
		
		MyThread obj = new MyThread();
		obj.start();
		
		for(int i = 0 ; i < 10; i++) {

			System.out.println("In Main");
			try {
				
				Thread.sleep(1000);
			} catch(InterruptedException ie) {

				System.out.println("Exception Handled");
			}
		}
	}
}
