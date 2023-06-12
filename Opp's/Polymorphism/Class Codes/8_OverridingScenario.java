class Parent {

	Parent() {
		
		System.out.println("Parent Constructor");
	}
	void fun(int x){
		
		System.out.println("In Parent Fun");
	}
}
class Child extends Parent {
	
	Child() {
		
		System.out.println("Child Constructor");
	}
	void fun(){
		
		System.out.println("In Child Fun");
	}
}
class Client {

	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.fun();
	}
}

/*
  Error: method fun in class Parent cannot be applied to given types;
		obj.fun();
		   ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length

 */
