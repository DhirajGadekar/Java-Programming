import java.io.*;

class ExceptionHandling {
	
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Integer Value : ");
		int data = 0;
		try {

			data = Integer.parseInt(br.readLine());
		} catch(NumberFormatException obj) {
			
			System.out.println("Please Enter Integer Data");
		}
		System.out.println(data);
	}
}
