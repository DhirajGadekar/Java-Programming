import java.util.*;

class CricPlayer {
	
	int jerNo = 0;
	String name = null;
	CricPlayer(int jerNo, String name) {
		
		this.jerNo = jerNo;
		this.name = name;
	}
	public String toString() {
		
		return this.name;
	}
}

class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();

		hs.add(new CricPlayer(18, "Virat"));
		hs.add(new CricPlayer(7, "MSD"));
		hs.add(new CricPlayer(45, "Rohit"));
		hs.add(new CricPlayer(7, "MSD"));

		System.out.println(hs);
	}
}
