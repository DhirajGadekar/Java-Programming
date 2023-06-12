abstract class Parent {
	
	void career() {

		System.out.println("IT Engineering");
	}
	abstract void marry();                     
}
class Child extends Parent {

	final void marry() {                        

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
