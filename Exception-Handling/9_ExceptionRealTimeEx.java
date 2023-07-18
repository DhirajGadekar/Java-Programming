import java.io.*;

class InvalidCredentialsException extends RuntimeException{
	
	InvalidCredentialsException(String msg) {
		
		super(msg);
	}
}

class Main {
	
	static String userName1 = "dhirajgadekar";
	static String password1 = "dhiraj@123";

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter UserName : ");
		String userName2 = br.readLine();

		System.out.print("Enter Password : ");
		String password2 = br.readLine();
	

		boolean flag = true;

		while(flag) {
			if(!(userName1.equals(userName2) && password1.equals(password2))) {
			
				try {
				
					throw new InvalidCredentialsException("Invalid username or password");
				} catch(InvalidCredentialsException ivc) {
					
					System.out.println(ivc.getMessage());
					System.out.print("Enter UserName : ");
					userName2 = br.readLine();

					System.out.print("Enter Password : ");
					password2 = br.readLine();
				}
			} else {
				
				System.out.println("Login Successful");
				flag = false;
			}
		}
	}
}
