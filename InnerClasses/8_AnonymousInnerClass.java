abstract class Demo {
	
	abstract void m2();
}
class Client {
	
	public static void main(String[] args) {

		Demo obj = new Demo() {
			
			void m2() {
				
				System.out.println("In m1-Inner");
			}
			
		};
		obj.m2();
	}
}
