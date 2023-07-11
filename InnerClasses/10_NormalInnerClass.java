class Outer {
	
	int x = 10;
	static int y = 20;
	class Inner {
		
		void m1() {
			
			System.out.println("Method-1-Inner");
			System.out.println(x);
			System.out.println(y);
			m2();
		}
	}
	void m2() {
		
		System.out.println("Method-2-Outer");
	}
}
class Clinet {
	
	public static void main(String[] args) {
		
		Outer obj = new Outer();

		Outer.Inner obj1 = obj.new Inner();
		obj1.m1();
	}
}
