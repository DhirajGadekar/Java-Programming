//File Writing :

import java.io.*;

class FileWriting {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("Incubator.txt");

		fw.write("Flutter");
		fw.write("BackEnd");
		fw.write("FrontEnd");

		fw.close();
		//fw.flush();
	}
}
