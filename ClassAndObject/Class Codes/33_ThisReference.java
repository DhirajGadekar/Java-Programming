class Demo {
	
	int x = 10;

	Demo() {

		System.out.println(x);
		System.out.println("In No-args Constructor");
	}
	Demo(int x) {
		
		System.out.println("1 Instance x : " + this.x);
		this.x = x; 
		System.out.println("Local x : " + x);
		System.out.println("2 Instance x : " + this.x);
		System.out.println("In Para Constructor");
	}
	Demo(float x) {

		this();
		System.out.println("Local x : " + x);
		System.out.println("Instance x : " + this.x);
	}

	public static void main(String[] args) {
		
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(60);
		Demo obj3 = new Demo(20.4f);
	}
}
