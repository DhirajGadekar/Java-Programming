//static Access Specifier : 

class Parent {
	
	void fun() {
		
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
/*
  Error: fun() in Child cannot override fun() in Parent
	static void fun() {
	            ^
  overriding method is static
 */
