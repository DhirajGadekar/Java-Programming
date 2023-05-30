class Demo {
	
	int x = 10;

	Demo() {
		
		System.out.println("Constructor 1");
		System.out.println("x = " + x);
	}
	
	Demo() {
		
		System.out.println("Constructor 2");
		System.out.println("x = " + x);
	}
}

/*
 O/P :
 	Error: constructor Demo() is already defined in class Demo
		Demo() {
		^
 */
