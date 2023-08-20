import java.util.*;

class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		
		IdentityHashMap map = new IdentityHashMap();

		map.put(new String("Kanha"), "Infosys");
		map.put(new String("Badhe"), "Barclays");
		map.put(new String("Kanha"), "BMC");
		map.put(new String("Rahul"), "CarPro");

		System.out.println(map);
	}
}
