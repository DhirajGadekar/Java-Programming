interface Demo {
	
	void fun();

	default void gun() {
		
		System.out.println("In gun Demo");
	}
}

class DemoChild implements Demo {
	
	public void fun() {
		
		System.out.println("In fun DemoChild");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Demo obj = new DemoChild();
		obj.fun();
		obj.gun();
	}
}
