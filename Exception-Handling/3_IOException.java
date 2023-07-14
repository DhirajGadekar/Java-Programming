import java.io.*;

class IOExceptionClass {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int data = Integer.parseInt(br.readLine());
		System.out.println(data);
	}
}

/*
 * O/P : Error: unreported exception IOException; must be caught or declared to be thrown
		int data = Integer.parseInt(br.readLine());
		                                       ^	
 */
