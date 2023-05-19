
import java.io.*;

class Employee {
	
	int empId;
	String empName;
	static String compName = "Nvidia";

	void employeeInfo() {
		
		System.out.println("Id : " + empId);
		System.out.println("Name : " + empName);
		System.out.println("Company Name : " + compName);
	}
}

class Main {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee emp1 = new Employee();
	
		System.out.println("Enter Employee Id :");
		emp1.empId = Integer.parseInt(br.readLine());

		System.out.println("Enter Employee Name :");
		emp1.empName = br.readLine();

		emp1.employeeInfo();
	}
}
