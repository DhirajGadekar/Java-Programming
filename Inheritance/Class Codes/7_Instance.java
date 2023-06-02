class Parent {

	int x = 10;
	Parent() {
		
		System.out.println("In Parent Constructor");
	}
	void access() {

		System.out.println("Parent Instance Method");
	}
}
class Child extends Parent {

	int y = 20;
	Child() {
		
		System.out.println("In Child Constructor");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.access();
	}
}
