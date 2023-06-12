abstract class Parent {
	
	void career() {

		System.out.println("IT Engineering");
	}
	abstract void marry(int x);                     
}
class Child extends Parent {

	void marry(int x) {                         

		System.out.println("Love Marriage");
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.career();
		obj.marry(10);
	}
}
