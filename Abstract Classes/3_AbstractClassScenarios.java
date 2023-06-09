abstract class Parent {
	
	void career() {

		System.out.println("IT Engineering");
	}
	private abstract void marry();               //Error
}
class Child extends Parent {

	void marry() {

		System.out.println("Love Marriage");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.career();
	}
}

/*
 Error: illegal combination of modifiers: abstract and private
	private abstract void marry();
	                      ^

 */
