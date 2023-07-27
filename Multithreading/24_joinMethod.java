class MyThread extends Thread {
	
	public void run() {
		
		System.out.println("In Thread");
		try {
			
			Thread.sleep(3000);
		} catch(InterruptedException ie) {
			
			ie.printStackTrace();
		}
		System.out.println("In Thread");
	}
}
class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread obj = new MyThread();
		obj.start();

		obj.join(2000,999999);

		System.out.println(Thread.currentThread().getName());
	}
}
