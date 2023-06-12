class Demo {

	void fun(Object obj) {

		System.out.println("Object");
	}
	void fun(String str) {
		
		System.out.println("String");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer("Core2Web"));
	}
}
