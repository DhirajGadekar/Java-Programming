import java.io.*;

class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File fobj1 = new File("Core2Web");

		File fobj2 = new File(fobj1, "Code2.txt");

		fobj2.createNewFile();

	}
}
