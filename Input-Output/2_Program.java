//Input take through the BufferedReader and InputStreamReader :

import java.io.*;

class inputDemo{
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the Name : ");
		String name = br.readLine();

		System.out.println("Enter the Age : ");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
