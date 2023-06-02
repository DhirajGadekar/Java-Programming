class Parent {

	static {

		System.out.println("Parent Static Block");
	}
}
class Child extends Parent {

	static {

		System.out.println("Child Static Block");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Child obj = new Child();
	}
}
