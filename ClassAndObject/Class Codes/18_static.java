class Demo {

	static {
	
		System.out.println("In Static Block 1");
	}

	public static void main(String[] args) {
		
		System.out.println("In Demo Main");
	}
}

class Client {

	static {
	
		System.out.println("In Static Block 2");
	}

	public static void main(String[] args) {
		
		System.out.println("In Client Main");
	}
}

/*
 O/P:
	dhiraj@dhiraj ~/J/C/Class Codes (main)> java Demo
	In Static Block 1
	In Demo Main

	dhiraj@dhiraj ~/J/C/Class Codes (main)> java Client
	In Static Block 2
	In Client Main
*/
