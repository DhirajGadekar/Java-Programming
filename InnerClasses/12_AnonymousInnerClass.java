class Demo {
	
	void marry() {
	
		System.out.println("Kriti Sanon");
	}
}
class Main {
	
	public static void main(String[] args) {
		
		Demo obj = new Demo() {
			
			void marry() {
				
				System.out.println("Disha Patni");
			}
		};
		obj.marry();
	}
}
