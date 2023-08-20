import java.util.*;

class SortedMapMethods {
	
	public static void main(String[] args) {
	
		SortedMap map = new TreeMap();

		map.put("Ind", "India");
		map.put("Ban", "Bangladesh");
		map.put("SL", "SriLanka");
		map.put("Aus", "Australia");
		map.put("Pak", "Pakistan");

		System.out.println(map);

		// 1) subMap(k, k)
		System.out.println(map.subMap("Aus", "Pak"));

		// 2) headMap(k)
		System.out.println(map.headMap("Pak"));

		// 3) tailMap(K)
		System.out.println(map.tailMap("Ind"));

		// 4) firstKey()
		System.out.println(map.firstKey());

		// 5) lastKey()
		System.out.println(map.lastKey());

		// 6) keySet()
		System.out.println(map.keySet());

		// 7) values()
		System.out.println(map.values());

		// 8) entrySet()
		System.out.println(map.entrySet());
	}
}
