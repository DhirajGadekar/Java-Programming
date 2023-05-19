class Demo {
	
	int x = 10;

	private void disp() {
		
		System.out.println(x);
	}	

	void access() {
		
		disp();
	}
}

class Main {
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.access();
	}
}
