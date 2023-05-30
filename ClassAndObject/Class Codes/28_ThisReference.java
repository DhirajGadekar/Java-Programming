
class Demo {

	int x = 10;

	Demo() {
	
		System.out.println("In No-args Constructor");
	}

	Demo(int x) {
		this();
		System.out.println("In Para Constructor");
	}

	public static void main(String[] args) {
		
		Demo obj = new Demo(10);
	}
}

