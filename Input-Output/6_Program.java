/*
 Program 6 : close system.in
 */

import java.io.*;

class IODemo{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the First Name : ");
		String str1 = br1.readLine();
		System.out.println("First Name : " + str1);
		
		br2.close();

		System.out.println("Enter the Last Name : ");
		String str2 = br2.readLine();
		System.out.println("Last Name : " + str2);
	}
}

/*
 O/p : 

Enter the First Name : 
Dhiraj
First Name : Dhiraj
Enter the Last Name : 
Exception in thread "main" java.io.IOException: Stream closed
	at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
	at java.base/java.io.BufferedReader.implReadLine(BufferedReader.java:363)
	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:348)
	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:437)
	at IODemo.main(6_Program.java:21)
 */
