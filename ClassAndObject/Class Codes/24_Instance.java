class Instance {
	
	int x = 10;
	static int y = 20;

	Instance() {
		
		System.out.println("In Constructor");
	}

	static {
		
		System.out.println("Static Block 1");
	}

	{
		
		System.out.println("Instance Block 1");
	}

	public static void main(String[] args) {
		
		Instance obj = new Instance();
	}
	
	static {
		
		System.out.println("Static Block 2");
	}

	{
		
		System.out.println("Instance Block 2");
	}
}
