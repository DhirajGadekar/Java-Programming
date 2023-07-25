class MyThread extends Thread {

	MyThread(ThreadGroup pThreadGP, String str) {

		super(pThreadGP,str);
	}

	public void run() {
		
		System.out.println(this);
	}
}

class Main {
	
	public static void main(String[] args) {
		
		ThreadGroup pThreadGP = new ThreadGroup("Core2Web");

		MyThread obj1 = new MyThread(pThreadGP,"C/Cpp & DS");
		MyThread obj2 = new MyThread(pThreadGP,"Java DS");
		MyThread obj3 = new MyThread(pThreadGP,"Python ML");
		
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
