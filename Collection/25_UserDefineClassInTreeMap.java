import java.util.*;

class Platform implements Comparable {
	
	String name = null;
	int year = 0;
	Platform(String name, int year) {
		
		this.name = name;
		this.year = year;
	}
	
	public int compareTo(Object obj) {
		
		return name.compareTo(((Platform)obj).name);
	}
	public String toString() {
		
		return "{" + name + ":" + year + "}";
	}
}
class Main {
	
	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		
		map.put(new Platform("Youtube", 2005), "Google");
		map.put(new Platform("FaceBook", 2004) , "Meta");
		map.put(new Platform("Instagram", 2010), "Meta");
		map.put(new Platform("ChatGPT", 2022), "OpenAI");
		map.put(new Platform("Dream11", 2008), "DreamSoprts");

		System.out.println(map);
	}
}
