import java.util.*;

class Platform {
	
	String name = null;
	Platform(String name) {
		
		this.name = name;
	}

	public String toString() {
		
		return name;
	}	
}

class SortedByName implements Comparator {
	
	public int compare(Object obj1, Object obj2) {

		return ((Platform)obj1).name.compareTo(((Platform)obj2).name);
	}
}
class Main {
	
	public static void main(String[] args) {
		
		TreeMap map = new TreeMap(new SortedByName());
		
		map.put(new Platform("Youtube"), "Google");
		map.put(new Platform("Instagram"), "Meta");
		map.put(new Platform("ChatGPT"), "OpenAI");
		map.put(new Platform("FaceBook"), "Meta");
		map.put(new Platform("Dream11"), "DreamSports");

		System.out.println(map);
	}
}
