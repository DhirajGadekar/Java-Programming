class Outer {
	
	class Inner {
		
		void m1() {
			
			System.out.println("In m1-Inner");
		}
	}

	void m2() {
		
		System.out.println("In m2-Outer");
	}

	public static void main(String[] args) {

		Outer obj1 = new Outer();
		obj1.m2();

		Inner obj2 = obj1.new Inner();
		obj2.m1();
	}
}
