class Employee {
	
	int empId = 10;
	String name = "Dhiraj";

	void empInfo() {
		
		System.out.println("ID : " + empId);
		System.out.println("Name : " + name);
	}
}

class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();

		emp.empInfo();

		System.out.println(emp.empI`id);
		System.out.println(emp.name);
	}
}
