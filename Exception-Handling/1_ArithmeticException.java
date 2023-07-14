class ArithmeticExceptionClass {
	
	void m1() {
		
		System.out.println("Start m1");
		m2();
		System.out.println("End m1");
	}
	void m2() {

		System.out.println(10/0);
	}
	public static void main(String[] args) {
		
		System.out.println("Start Main");
		ArithmeticExceptionClass obj = new ArithmeticExceptionClass();
		obj.m1();
		System.out.println("End Main");
	}
}

/*
 O/P :
	Start Main
	Start m1
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at ArithmeticExceptionClass.m2(1_ArithmeticException.java:11)
		at ArithmeticExceptionClass.m1(1_ArithmeticException.java:6)
		at ArithmeticExceptionClass.main(1_ArithmeticException.java:17)
 */
