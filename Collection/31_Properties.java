import java.io.*;
import java.util.*;

class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();

		FileInputStream fis = new FileInputStream("Friends.properties");
		p.load(fis);

		String name = p.getProperty("Ashish");
		System.out.println(name);

		p.setProperty("Shashi", "Biencaps");
		FileOutputStream out = new FileOutputStream("Friends.properties");

		p.store(out, "Updated By Dhiraj");
	}
}
