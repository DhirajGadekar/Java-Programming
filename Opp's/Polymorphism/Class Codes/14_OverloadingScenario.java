class Demo {

	void fun(String str) {

		System.out.println("String");
	}
	void fun(StringBuffer str) {
		
		System.out.println("StringBuffer");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer("Core2Web"));
	}
}
