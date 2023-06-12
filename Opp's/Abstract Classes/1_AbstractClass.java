abstract class Parent {
	
	void career() {
		
		System.out.println("IT Engineering");
	}
	abstract void marry();
}
class Client {
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
	}
}	

/*
  Error: Parent is abstract; cannot be instantiated
		Parent obj = new Parent();
		             ^

 */
