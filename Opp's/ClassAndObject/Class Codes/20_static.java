class StaticDemo {
	
	static int x = 10;

	static {
		
		//static int y = 20;
	}

	void fun() {
		
		//static int z = 20;
	}
	static void gun() {
		
		static int p = 20;
	}
}

/*
   O/P :

         Error: illegal start of expression
		static int p = 20;
		^
 
 */
