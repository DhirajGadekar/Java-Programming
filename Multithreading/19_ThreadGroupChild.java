class MyThread extends Thread {
	
	MyThread(ThreadGroup threadGP, String str) {
		
		super(threadGP,str);
	}

	public void run() {
		
		System.out.println(this);
	}
}	
class Main {
	
	public static void main(String[] args) {
		
		ThreadGroup pThreadGP = new ThreadGroup("Core2Web");

		MyThread obj1 = new MyThread(pThreadGP, "C");
		MyThread obj2 = new MyThread(pThreadGP, "Java");
		MyThread obj3 = new MyThread(pThreadGP, "Python");
		
		obj1.start();
		obj2.start();
		obj3.start();
		
		ThreadGroup cThreadGP = new ThreadGroup(pThreadGP, "Incubetor");
		MyThread obj4 = new MyThread(cThreadGP, "Flutter");
		MyThread obj5 = new MyThread(cThreadGP, "ReactJS");
		MyThread obj6 = new MyThread(cThreadGP, "SpringBoot");
		
		obj4.start();
		obj5.start();
		obj6.start();
	}
}
