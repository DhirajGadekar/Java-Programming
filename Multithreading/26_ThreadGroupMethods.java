
class MyThread extends Thread {
	
	MyThread(ThreadGroup tg, String str) {
		
		super(tg, str);
	}
	public void run() {
		
		System.out.println(Thread.currentThread());
		try {
			
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			
			ie.printStackTrace();
		}
	}
}

class Main {
	
	public static void main(String[] args) {
		
		ThreadGroup pThreadGP = new ThreadGroup("Country");

		MyThread t1 = new MyThread(pThreadGP, "India");
		MyThread t2 = new MyThread(pThreadGP, "USA");
		
		t1.start();
		t2.start();
		
		ThreadGroup cThreadGP1 = new ThreadGroup(pThreadGP,"state");
		MyThread t3 = new MyThread(cThreadGP1, "Maharashtra");
		MyThread t4 = new MyThread(cThreadGP1, "Goa");
		
		t4.start();
		t3.start();
		
		ThreadGroup cThreadGP2 = new ThreadGroup(cThreadGP1, "Cities");
		MyThread t5 = new MyThread(cThreadGP2, "Mumbai");
		MyThread t6 = new MyThread(cThreadGP2, "Pune");

		t5.start();
		t6.start();
		
		System.out.println("Active Thread Count : " + pThreadGP.activeCount());
		System.out.println("Active Group Count : " + pThreadGP.activeGroupCount());
	}
}
