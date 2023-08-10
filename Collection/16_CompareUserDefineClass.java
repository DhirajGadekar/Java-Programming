import java.util.*;

class CricPlayer implements Comparable {
	
	String name = null;
	CricPlayer(String name) {
		
		this.name = name;
	}
	
	public int compareTo(Object obj) {
		
		return this.name.compareTo(((CricPlayer)obj).name);
	}

	public String toString() {
		
		return name;
	}
}
class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();

		ts.add(new CricPlayer("Rohit"));
		ts.add(new CricPlayer("Virat"));
		ts.add(new CricPlayer("MSD"));
		ts.add(new CricPlayer("MSD"));
		ts.add(new CricPlayer("Surya"));
		ts.add(new CricPlayer("Tilak"));
		ts.add(new CricPlayer("Tilak"));
		ts.add(new CricPlayer("Ishan"));

		System.out.println(ts);
	}
}
