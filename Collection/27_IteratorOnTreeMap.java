import java.util.*;

class Main {
	
	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();

		map.put("Ind", "India");
		map.put("Aus", "Australia");
		map.put("SL", "SriLanka");
		map.put("Ban", "Bangladesh");
		map.put("Pak", "Pakistan");

		System.out.println(map);

		Set<Map.Entry> data = map.entrySet();
		Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()) {
			
			Map.Entry entry = itr.next();
			System.out.println(entry);
		}
	}
}
