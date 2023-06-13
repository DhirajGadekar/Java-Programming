interface Demo {
	
	default void fun() {
		
		System.out.println("In fun Demo");
	}
	static void gun() {
		
		System.out.println("In gun Demo");
	}
}
