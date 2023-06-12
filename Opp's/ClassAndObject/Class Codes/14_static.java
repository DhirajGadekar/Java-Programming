class StaticDemo {
	
	static int x = 10;
	static int y = 20;

	static void disp() {
		
		System.out.println(x);
		System.out.println(y);
	}
}

class Main {
	
	public static void main(String[] args) {
		
		System.out.println(StaticDemo.x);
		System.out.println(StaticDemo.y);
		
		StaticDemo.disp();
	}
}
