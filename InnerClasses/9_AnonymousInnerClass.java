interface Outer {

	void m1();
}
class Main {
	
	public static void main(String[] args) {
		
		Outer obj = new Outer() {
			
			public void m1() {
				
				System.out.println("In m1-Inner");
			}
		};
		obj.m1();
	}
}
