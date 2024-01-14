
class Demo {
	
	String str = null;	
	Demo(String str) {
		
		this.str = str;
	}

	public void finalize() {
		
		System.out.println("Object Deleted");
	}
	public String toString() {

		return str;
	}
}

class Main {
	
	public static void main(String[] args) {
		
		Demo obj1 = new Demo("Core2web");
		Demo obj2 = new Demo("Biencaps");
		Demo obj3 = new Demo("Incubator");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		obj1 = null;
		obj2 = null;

		System.gc();
	}
}
