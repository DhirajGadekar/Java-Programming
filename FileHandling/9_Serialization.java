import java.io.*;

class Player implements Serializable {
	
	int jerNo;
	String pName;
	Player(int jerNo, String pName) {
	
		this.jerNo = jerNo;
		this.pName = pName;
	}
}

class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Player p1 = new Player(45, "Rohit");
		System.out.println(p1.hashCode());
		FileOutputStream fos = new FileOutputStream("Player.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p1);

		fos.close();
		oos.close();

	}
}	
