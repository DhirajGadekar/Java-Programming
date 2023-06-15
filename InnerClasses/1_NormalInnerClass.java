class Outer {
	
	class Inner {
		
		void m1() {
			
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

		//Method 1 :
		Outer.Inner obj1 = obj.new Inner();
		
		//Method 2 :
		Outer.Inner obj2 = new Outer().new Inner();

		obj.m2();

		obj1.m1();
		obj2.m1();
	}
}
