import java.util.*;

class Movies {
	
	String name = null;
	double col = 0.0;
	float imdb = 0.0f;

	Movies(String name, double col, float imdb) {
		
		this.name = name;
		this.col = col;
		this.imdb = imdb;
	}
	public String toString() {
		
		return "{" + name + ":" + col + ":" + imdb + "}";
	}
}

class SortedByName implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		
		return (((Movies)obj1).name).compareTo(((Movies)obj2).name);
	}
}

class SortedByCol implements Comparator {

	public int compare(Object obj1, Object obj2) {
	
		return (int)((((Movies)obj1).col) - (((Movies)obj2).col));
	}
}

class SortedByIMDB implements Comparator {

	public int compare(Object obj1, Object obj2) {

		return (int)((((Movies)obj1).imdb) - (((Movies)obj2).imdb));
	}
}
class Main {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add(new Movies("OMG2", 120.00, 8.0f));
		al.add(new Movies("Gadar2", 450.00, 9.0f));
		al.add(new Movies("Kantara", 170.00, 8.7f));
		al.add(new Movies("Jailer", 250.00, 9.2f));

		System.out.println(al);

		Collections.sort(al, new SortedByName());
		System.out.println(al);
		
		Collections.sort(al, new SortedByCol());
		System.out.println(al);
		
		Collections.sort(al, new SortedByIMDB());
		System.out.println(al);
	}
}
