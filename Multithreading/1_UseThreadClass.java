class MyThread extends Thread {
	
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("In Run");
		}
	}
}
class Main {
	
	public static void main(String[] args) {
		
		MyThread obj = new MyThread();
		obj.start();

		for(int i = 0; i < 10; i++) {
			
			System.out.println("In main");
		}
	}
}
