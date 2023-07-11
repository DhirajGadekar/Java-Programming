class Outer {
	
	int x = 10;
	static int y = 20;

	class Inner {
		
		int a = 30;
		static int b = 40;
		void m1() {
			
			System.out.println(a);
			System.out.println(b);
		}
	}
}
class Main {
	
	public static void main(String[] args) {
		
		System.out.println(Outer.Inner.b);
	}
}
