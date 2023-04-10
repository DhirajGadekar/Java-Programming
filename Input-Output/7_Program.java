/*
 Program 7 : Stream close
 */

import java.io.*;

class IODemo{
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the First Name : ");
                String str1 = br.readLine();
                System.out.println("First Name : " + str1);

                br.close();

                System.out.println("Enter the grade : ");
                char ch = (char)isr.read();
                System.out.println("grade : " + ch);

	}	
}

/*
 O/p : 

Enter the First Name :
Dhiraj
First Name : Dhiraj
Enter the grade :
Exception in thread "main" java.io.IOException: Stream closed
	at java.base/java.io.BufferedInputStream.getBufIfOpen(BufferedInputStream.java:172)
	at java.base/java.io.BufferedInputStream.implRead(BufferedInputStream.java:373)
	at java.base/java.io.BufferedInputStream.read(BufferedInputStream.java:361)
	at java.base/sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:333)
	at java.base/sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:376)
	at java.base/sun.nio.cs.StreamDecoder.lockedRead(StreamDecoder.java:219)
	at java.base/sun.nio.cs.StreamDecoder.read(StreamDecoder.java:173)
	at java.base/sun.nio.cs.StreamDecoder.lockedRead0(StreamDecoder.java:152)
	at java.base/sun.nio.cs.StreamDecoder.read0(StreamDecoder.java:131)
	at java.base/sun.nio.cs.StreamDecoder.read(StreamDecoder.java:123)
	at java.base/java.io.InputStreamReader.read(InputStreamReader.java:181)
	at IODemo.main(7_Program.java:21)

 */
