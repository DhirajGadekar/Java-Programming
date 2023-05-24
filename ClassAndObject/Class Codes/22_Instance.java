class Instance {
	
	int x = 10;

	Instance() {
		
		System.out.println("In Constructor");
	}

	{
		System.out.println("In Instance Block 1");
	}

	public static void main(String[] args) {
		
		Instance obj = new Instance();
		System.out.println("Main");
	}

	{
		System.out.println("In Instance Block 2");
	}
}
