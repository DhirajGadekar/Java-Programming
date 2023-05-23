class Employee {

        int empId = 10;
        String name = "Dhiraj";
	static String comName = "Nvidia";

        void empInfo() {

                System.out.println("ID : " + empId);
                System.out.println("Name : " + name);
                System.out.println("Company Name : " + comName);
        }
}

class Main {

        public static void main(String[] args) {

                Employee emp1 = new Employee();
                Employee emp2 = new Employee();

                emp1.empInfo();
                emp2.empInfo();

                System.out.println("-----------------------------------");

		emp2.empId = 20;
		emp2.name = "Vikee";
		emp2.comName = "Adobe";

                emp1.empInfo();
                emp2.empInfo();
        }
}

