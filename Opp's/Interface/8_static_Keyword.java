interface Demo {
	
	static void fun() {

		System.out.println("In fun Demo");
	}
}
class DemoChild implements Demo {

}
class Client {
	
	public static void main(String[] args) {
		
		Demo obj = new DemoChild();
		obj.fun();
	}
}

/*
  Error: illegal static interface method call
		obj.fun();
		       ^
  the receiver expression should be replaced with the type qualifier 'Demo'

 */

/*
 The error occurs because static methods are not inherited by implementing classes or their instances. 
 Static methods belong to the interface itself and are associated with the interface's name. Therefore, 
 when calling a static method defined in an interface, it should be invoked using the interface name itself, 
 rather than an instance of the implementing class.

To fix the error, the code should be modified to call the static method fun() using the interface name:
	
	Demo.fun();
 */
