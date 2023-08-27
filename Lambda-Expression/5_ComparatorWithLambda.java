import java.util.*;

class Employee {
	
	String name = null;
	int empId = 0;
	Employee(String name, int empId) {
		
		this.name = name;
		this.empId = empId;
	}
	public String toString() {

		return empId + " : " + name;
	}
}

class Main {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new Employee("Kanha", 23));
		al.add(new Employee("Rahul", 25));
		al.add(new Employee("Ashish", 26));
		al.add(new Employee("Badhe", 24));

		Collections.sort(al, (Object obj1, Object obj2)-> {
			
			return ((Employee)obj1).name.compareTo(((Employee)obj2).name);	
		});
		
		System.out.println(al);
	}
}
