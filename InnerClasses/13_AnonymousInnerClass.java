class Demo {
	
	void marry() {
		
		System.out.println("Kriti Sanon");
	}
}

class Main {
	
	public static void main(String[] args) {
		
		Demo obj = new Demo() {
			
			void marry() {
				
				System.out.println("Disha patni");
				//fun();
			}
			Demo fun() {
				
				System.out.println("Fun-Method");
				return new Demo();
			}
		}.fun();
		obj.marry();
	}
}

