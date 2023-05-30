class Demo {
	
	int x = 10;

	Demo() {
		
		System.out.println("In No-args Constructor");
	}
	Demo(int x) {

		System.out.println("In Para Constructor");
		this();
	}
	public static void main(String[] args) {

		Demo obj = new Demo(20);
	}
}

/*
 O/P :
	 Error: call to this must be first statement in constructor
		this();

 */
