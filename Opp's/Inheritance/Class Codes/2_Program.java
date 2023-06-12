
class Parent {
	
	Parent() {
		
		System.out.println("In Parent Constructor");
	}
}
class Child extends Parent {
	
	Child() {

		System.out.println("In Child Constructor");
	}
}

class Main {
	
	public static void main(String[] args) {
		
		Parent obj1 = new Parent();
		Child obj2 = new Child();
	}
}

