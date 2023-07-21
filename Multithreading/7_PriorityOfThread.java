class MyThread extends Thread {
	
	public void run() {
		
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		//currentThread return Thread class obj when we print them then its print thread name, priority and thread group
	}
}	

class Main {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		MyThread obj = new MyThread();
		obj.start();

		System.out.println(t);
	}
}
