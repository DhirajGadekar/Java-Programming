class Outer {
	
	void m1() {
		
		System.out.println("In m1-Outer");
	}
	static class Inner {
		
		void m2() {
			
			System.out.println("In m2-Inner");
		}
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Outer obj1 = new Outer();
		obj1.m1();

		Outer.Inner obj2 = new Outer.Inner();
		obj2.m2();
	}
}
