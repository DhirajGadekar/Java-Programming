class Demo {
	
	int x = 10;

	Demo() {
		
		System.out.println("X = " + this.x);
		System.out.println(x);
	}
	Demo(int x) {
		
		System.out.println("Local : " + x);
		System.out.println("Instance : " + this.x);
	}

	public static void main(String[] args) {
		
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(30);

	}
}
