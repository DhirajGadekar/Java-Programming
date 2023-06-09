abstract class Parent {
	
	void career() {

		System.out.println("IT Engineering");
	}
	abstract void marry();                     
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
  Error: marry() in Child cannot override marry() in Parent
	static void marry() {                        
	            ^
  overriding method is static

  */
