import java.util.*;

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
			
		WeakHashMap map = new WeakHashMap();
		map.put(obj1, "2016");
		map.put(obj2, "2019");
		map.put(obj3, "2023");
		
		System.out.println(map);
		
		obj1 = null;
		obj2 = null;

		System.gc();
		
		System.out.println(map);
	}
}
