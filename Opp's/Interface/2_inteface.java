interface Demo {
	
	void fun();
	void gun();
}
abstract class DemoChild1 implements Demo {
	
	public void fun() {

		System.out.println("In fun DemoChild");
	}
}
class DemoChild2 extends DemoChild1 {
	
	public void gun() {
		
		System.out.println("In gun DemoChild");
	}
}
class Client {

	public static void main(String[] args) {
		
		Demo obj = new DemoChild2();
		obj.fun();
		obj.gun();
	}
}
