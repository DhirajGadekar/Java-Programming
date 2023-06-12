class ICC {

	ICC() {

		System.out.println("In ICC Constructor");
	}
}
class BCCI extends ICC {
	
	BCCI() {
		
		System.out.println("In BCCI Constructor");
	}
}

class IPL extends BCCI {
	
	IPL() {
		
		System.out.println("In IPL Constructor");
	}
}

class Main {
	
	public static void main(String[] args) {
		
		IPL obj = new IPL();
	}
}
