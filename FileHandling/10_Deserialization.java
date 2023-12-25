import java.io.*;

class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream fis = new FileInputStream("Player.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Player obj = (Player)ois.readObject();
		
		System.out.println(obj.jerNo);
		System.out.println(obj.pName);
		fis.close();
		ois.close();
	}
}
