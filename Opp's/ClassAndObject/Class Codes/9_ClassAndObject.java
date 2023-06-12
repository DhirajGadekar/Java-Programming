class Core2Web {
	
	int noOfCource = 6;
	String favCource = "Java";

	void disp() {
		
		System.out.println(noOfCource);
		System.out.println(favCource);
	}
}

class User {

	public static void main(String[] args) {
		
		Core2Web obj = new Core2Web();

		obj.disp();
	}
}
