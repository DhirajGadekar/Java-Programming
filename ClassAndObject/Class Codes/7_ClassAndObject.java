class Project {
	
	String proName = "OnlineEdu";
	int noOfEmp = 20;

	void clientInfo() {
		
		String clientName = "Core2Web";
		System.out.println(clientName);
		System.out.println(proName);
		System.out.println(noOfEmp);
	}
}

class C2W {
	
	public static void main(String[] args) {
		
		Project obj = new Project();

		obj.clientInfo();
	}
}
