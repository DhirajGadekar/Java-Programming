class Outer {
	
	class Inner {
		
		void m1() {
			
			System.out.println("M1-Inner-Class");
		}
	}
	class ChildInner extends Inner {
		
		void m3() {
			
			System.out.println("M3-ChildInner-Class");
		}
	}	

}
class Client {
	
	public static void main(String[] args) {
		
		Outer.ChildInner obj = new Outer().new ChildInner();
		obj.m1();
		obj.m3();
	}
}
