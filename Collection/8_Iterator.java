import java.util.*;

class InteratorCursor {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);

		Iterator cursor = al.iterator();
		while(cursor.hasNext()) {
			
			if(al.get(2) == cursor.next()) {
				
				cursor.remove();
			}
		}
		System.out.println(al);
	}
}
