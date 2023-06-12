
class Demo {
	
	int x = 10;
	static int y = 20;

	void fun1() {
		
		System.out.println(x);
		System.out.println(y);
	}

	static void fun2() {

		System.out.println(y);
	}
}

class Main {

	public static void main(String[] args){
		
		Demo obj = new Demo();

		obj.fun1();
		obj.fun2();

		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
