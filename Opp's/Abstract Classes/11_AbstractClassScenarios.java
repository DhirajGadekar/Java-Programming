abstract class Parent {
	
	void career() {

		System.out.println("IT Engineering");
	}
	static abstract void marry();                     
}
class Child extends Parent {

	static void marry() {                        

		System.out.println("Love Marriage");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.marry();
		obj.career();
	}
}

/*
 Error: illegal combination of modifiers: abstract and static
	static abstract void marry();                     
	                     ^

 */
