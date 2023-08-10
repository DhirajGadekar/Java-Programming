import java.util.*;

class MyThread extends Thread {
	
	Vector v = null;
	int num = 0;
	MyThread(Vector v, int num) {
		
		this.v = v;
		this.num = num;
	}
	public void run() {
		
		System.out.println(v.firstElement());
		v.addElement(num);
		System.out.println(v.lastElement());
	}
}

class Main {
	
	public static void main(String[] args) {
			
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);

		MyThread obj1 = new MyThread(v, 45);
		obj1.start();
		
		MyThread obj2 = new MyThread(v, 50);
		obj2.start();
	}
}
