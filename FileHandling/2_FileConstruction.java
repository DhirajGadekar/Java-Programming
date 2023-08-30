import java.io.*;

class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File fobj1 = new File("Core2Web", "Core1.txt");

		fobj1.createNewFile();
		
		File fobj2 = new File("Core2Web", "Core");

		fobj2.mkdir();

	}
}
