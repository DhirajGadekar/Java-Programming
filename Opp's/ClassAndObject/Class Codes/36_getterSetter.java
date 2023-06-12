
class Player {
	
	private int jerNo = 10;
	private String name = null;

	Player(int jerNo, String name) {
			
		this.jerNo = jerNo;
		this.name = name;
		System.out.println("In Constructor");
	}
	void info() {
		
		System.out.println(jerNo + " = " + name);
	}
}
class Client {
	
	public static void main(String[] args) {
		
		Player obj1 = new Player(18, "Virat");
		obj1.info();
		
		Player obj2 = new Player(7, "MSD");
		obj2.info();
		
		Player obj3 = new Player(45, "Rohit");
		obj3.info();
	}
}
