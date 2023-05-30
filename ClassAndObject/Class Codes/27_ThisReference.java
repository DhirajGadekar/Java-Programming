class ThisRefer {
	
	int x = 10;
	ThisRefer() {
	
		System.out.println("In Constructor");
		System.out.println(this);
		System.out.println(this.x);
	}

	void fun() {
		
		System.out.println(this);
		System.out.println(x);
	}
	public static void main(String[] args) {

		ThisRefer obj = new ThisRefer();

		obj.fun();
	}
}
