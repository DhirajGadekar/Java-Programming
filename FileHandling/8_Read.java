// File Reading :

import java.io.*;

class ReadFile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fir = new FileInputStream("Incubator.txt");

		FileDescriptor fd = fir.getFD();

		FileReader fr = new FileReader(fd);

		int data = fr.read();

		while(data != -1) {
			
			System.out.print((char)data);
			data = fr.read();
		}

		fr.close();
	}
}
