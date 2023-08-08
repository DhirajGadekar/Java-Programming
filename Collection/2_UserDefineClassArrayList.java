import java.util.*;

class CricPlayer {
	
	String name = null;
	int jerNo = 0;
	CricPlayer(String name, int jerNo) {
		
		this.name = name;
		this.jerNo = jerNo;
	}

	public String toString() {
		
		return jerNo + " : " + name;
	}
}
class Main {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add(new CricPlayer("Rohit", 45));
		al.add(new CricPlayer("Virat", 18));
		al.add(new CricPlayer("MSDhoni", 7));

		System.out.println(al);
	}
}
