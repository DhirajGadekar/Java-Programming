class Demo {
	
	void fun(int x) {
		
		System.out.println("In Int Parameter");
		System.out.println(x);
	}
	void fun(float x) {
		
		System.out.println("In float Parameter");
		System.out.println(x);
	}
	void fun(Demo obj) {
		
		System.out.println("In demo Parameter");
		System.out.println(obj);
	}
}

class Client {
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();

		obj.fun(10);
		obj.fun(10.05f);

		obj.fun(obj);

		System.out.println(obj);
	}
}
