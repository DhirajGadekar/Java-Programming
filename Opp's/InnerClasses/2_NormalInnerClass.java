class Outer {
	
	static int x = 10;
	int y = 20;
	class Inner {
		
		void m1() {
			
			System.out.println(Outer.x);
			System.out.println(x);
			System.out.println(y);
			System.out.println("M1-Inner-Class");
		}
	}

	void m2() {
			
		System.out.println("M2-Outer-Class");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Outer obj = new Outer();

		Outer.Inner obj1 = new Outer().new Inner();

		obj.m2();
		obj1.m1();
	}
}
