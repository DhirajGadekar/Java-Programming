import java.io.*;

class NumberFormatExceptionClass {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Integer Value : ");
		int data = Integer.parseInt(br.readLine());
		System.out.println(data);
	}
}

/*
 * O/P : Enter Integer Value : 
	 dhiraj
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "dhiraj"
		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		at java.base/java.lang.Integer.parseInt(Integer.java:665)
		at java.base/java.lang.Integer.parseInt(Integer.java:781)
		at NumberFormatExceptionClass.main(4_NumberFormatException.java:10)
 */
