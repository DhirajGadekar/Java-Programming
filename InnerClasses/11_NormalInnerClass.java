class Outer {
	
	int x = 10;
	static int y = 20;

	class Inner {
		
		int a = 30;
		final static int b = 40;
		//static int b = 40;
		void m1() {
			
			System.out.println(a);
			System.out.println(b);
		}
	}
}
class Main {
	
	public static void main(String[] args) {
		
		Outer obj = new Outer();
		System.out.println(obj.new Inner().b);
		//System.out.println(Outer.Inner.b);
	}
}

/*
 * Error: Illegal static declaration in inner class Outer.Inner
		static int b = 40;
		           ^
          modifier 'static' is only allowed in constant variable declaration

 * Note :
	Before the Java 17 update Static didn't work in the inner class, 
	so we were adding the final keywork before the static variable. 
	But after the update of java 17 there is no need to add final 
	keyboard. static also works without adding final keyboard
 */
