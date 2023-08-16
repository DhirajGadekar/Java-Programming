
import java.util.*;

class Employee {
	
	String name = null;
	float sal = 0.0f;
	Employee(String name, float sal) {
		
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		
		return "{" + name + ":" + sal + "}";
	}
}

class SortedByName implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		
		return (e1.name).compareTo(e2.name);
	}
}

class SortedBySal implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		
		return (int)((e1.sal) - (e2.sal));
	}
}
class Main {
	
	public static void main(String[] args) {
		
		LinkedList<Employee> ll = new LinkedList<Employee>();

		ll.add(new Employee("Kanha", 12.0f));
		ll.add(new Employee("Badhe", 20.0f));
		ll.add(new Employee("Ashish", 17.0f));
		ll.add(new Employee("Rahul", 13.0f));
		ll.add(new Employee("Kanha", 15.0f));
		ll.add(new Employee("Rahul", 10.0f));

		System.out.println("Without Sort : " + ll);

		Collections.sort(ll, new SortedByName());
		System.out.println("Sorted By Name : " + ll);
		
		Collections.sort(ll, new SortedBySal());
		System.out.println("Sorted By Sal : " + ll);
	}
}
