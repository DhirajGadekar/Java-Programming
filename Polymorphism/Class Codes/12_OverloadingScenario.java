class Demo {

	void fun(int x) {
		
		System.out.println("Int Parameter");
	}
	void fun(float x) {
		
		System.out.println("Float Parameter");
	}
}
class Client {
	
	public static void main(String[] args) {

		Demo obj = new Demo();
		obj.fun(10);
	}
}
