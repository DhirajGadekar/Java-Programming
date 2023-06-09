abstract class Parent {
	
	void career() {

		System.out.println("IT Engineering");
	}
	final abstract void marry();           //Error              
}
class Child extends Parent {

	void marry() {                         //Error

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
  Error: illegal combination of modifiers: abstract and final
	final abstract void marry();       

	
  Error: marry() in Child cannot override marry() in Parent
	void marry() {          
	     ^
  overridden method is final
 
 */
