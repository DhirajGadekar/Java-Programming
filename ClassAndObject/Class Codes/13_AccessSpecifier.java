class Demo {
	
	int x = 10;
	private int y = 20;
	static int z = 30;

	void disp() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}	
}

class Client {

	public static void main(String[] args) {

		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj1.disp();
		obj2.disp();
		
		System.out.println("-------------------------------");
		obj1.x = 100;
		obj2.z = 300;

		obj1.disp();
		obj2.disp();
	}
}
