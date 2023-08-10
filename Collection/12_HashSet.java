import java.util.*;

class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();

		System.out.println(hs.size());
		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Rahul");
		hs.add("Badhe");
		hs.add("Ashish");
		hs.add("Shashi");
		hs.add("Kanha");

		System.out.println(hs.size());
		System.out.println(hs);
		
		System.out.println(hs.contains("Rahul"));
	}
}
