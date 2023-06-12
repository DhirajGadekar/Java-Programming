
class Demo {
	
	int x = 10;

	Demo() {
		
		System.out.println("In No-args Constructor");
	}
	Demo(int x) {
		
		super();            //Con't written super() and this() in same Constructor
		this();
		System.out.println("In Para Constructor");
	}

	public static void main(String[] args) {
		
		Demo obj = new Demo(10);
	}
}

/*
 O/P:
 	Error: call to this must be first statement in constructor
		this();

 */
