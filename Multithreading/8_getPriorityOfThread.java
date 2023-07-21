class MyThread extends Thread {
	
	public void run() {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}

class Main {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		
		MyThread obj1 = new MyThread();
		obj1.start();
		
		try {
			
			t.setPriority(8);
		} catch(IllegalArgumentException obj) {
			
			System.out.println("Priority Value is max = 10 and min = 1");
		}
		
		MyThread obj2 = new MyThread();
		obj2.start();
	}
}
