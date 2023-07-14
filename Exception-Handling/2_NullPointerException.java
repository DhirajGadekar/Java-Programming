class NullPointerExceptionClass {
	
	void m1() {
		
		System.out.println("IN m1");
	}
	void m2() {

		System.out.println("IN m2");
	}
	public static void main(String[] args) {
		
		NullPointerExceptionClass obj = new NullPointerExceptionClass();
		obj.m1();

		obj = null;

		obj.m2();
	}
}

/*
 *O/P : IN m1
	Exception in thread "main" java.lang.NullPointerException: Cannot invoke "NullPointerExceptionClass.m2()" because "<local1>" is null
		at NullPointerExceptionClass.main(1_NullPointerException.java:18)

 */
