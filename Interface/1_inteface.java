interface Demo {
	
	void fun();               //public abstract void fun();
	void gun();		  //public abstract void gun();
}
class DemoChild implements Demo {

	public void fun() {

		System.out.println("In fun DemoChild");
	}
	public void gun() {

		System.out.println("In gun DemoChild");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Demo obj = new DemoChild();
		obj.fun();
		obj.gun();
	}
}
