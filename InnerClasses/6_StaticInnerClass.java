class Outer {

	void m1() {

		System.out.println("In m1-Outer");
	}
	static class Inner {
		
		void m2() {

			System.out.println("In m2-Inner");
		}
	}

	public static void main(String[] args) {
		
		Inner obj = new Inner();
		obj.m2();
	}
}
