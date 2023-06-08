//Final Access Specifier : 

class Parent {
	
	void fun() {
		
		System.out.println("Parent Fun");
	}
}
class Child extends Parent {

	final void fun() {

		System.out.println("Child Fun");
	}
}
class Client {

	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.fun();
	}
}
