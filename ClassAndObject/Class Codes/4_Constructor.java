class ConstrDemo {
	
	ConstrDemo() {
		
		System.out.println("In Constructor");
	}

	void fun() {
		
		ConstrDemo obj = new ConstrDemo();	
	}
	public static void main(String[] args) {
		
		ConstrDemo obj1 = new ConstrDemo();	
		ConstrDemo obj2 = new ConstrDemo();	

		obj1.fun();
	}
}
