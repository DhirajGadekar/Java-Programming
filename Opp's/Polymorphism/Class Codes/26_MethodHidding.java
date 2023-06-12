//Method Hidding: 

class Parent {
	
	static void fun() {
		
		System.out.println("Parent Fun");
	}
}
class Child extends Parent {

	static void fun() {

		System.out.println("Child Fun");
	}
}
class Client {

	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.fun();
	}
}

