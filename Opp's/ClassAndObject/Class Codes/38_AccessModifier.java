class Employee {
	
	Employee(int x) {

	}

	public Employee(float x) {

	}

	private Employee(double x) {

	}

	protected Employee(char c) {

	}
	
	static Employee(String x) {


	}
}

/*
 O/P :
 	Error: modifier static not allowed here
		static Employee(String x) {
	       	       ^
 */
