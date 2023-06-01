
class SchedulingAlgorithm {

	SchedulingAlgorithm() {
		
		System.out.println("In SchedulingAlgorithm Constructor");
	}
}

class FCFS extends SchedulingAlgorithm {
	
	String algoName = "FCFS";
	FCFS() {
		
		System.out.println("In FCFS Constructor");
	}
	void displayInfo() {
		
		System.out.println("Scheduling Alorithm : "+ algoName);
	}
}

class Main {
	
	public static void main(String[] args) {
		
		FCFS obj = new FCFS();
		obj.displayInfo();
	}
}
