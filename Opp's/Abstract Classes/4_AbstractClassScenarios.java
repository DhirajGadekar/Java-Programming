abstract class Parent {
	
	void career() {

		System.out.println("IT Engineering");
	}
	abstract void marry();               
}
class Child extends Parent {

	private void marry() {          //Error

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
 Error: marry() in Child cannot override marry() in Parent
	private void marry() {
	             ^
  attempting to assign weaker access privileges; was package

 */
