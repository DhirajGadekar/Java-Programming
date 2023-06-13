interface Demo1 {

	default void fun() {
		
		System.out.println("In fun-Demo1");
	}
}
interface Demo2 {
	
	default void fun() {
		
		System.out.println("In Fun-Demo2");
	}
}
class DemoChild implements Demo1,Demo2 {


}
class Client {
	
	public static void main(String[] args) {
		
		Demo1 obj = new DemoChild();

		obj.fun();
	}
}

/*
 Error: types Demo1 and Demo2 are incompatible;
	class DemoChild implements Demo1,Demo2 {
	^
  class DemoChild inherits unrelated defaults for fun() from types Demo1 and Demo2

 */

/*
 This error occurs because when a class implements multiple interfaces that have default methods with the same name, a conflict arises. The class is required to provide an implementation for the conflicting method. In this case, DemoChild needs to provide its own implementation of the fun() method.

To fix the compilation error, you can override the fun() method in the DemoChild class and provide a specific implementation. 
 */
