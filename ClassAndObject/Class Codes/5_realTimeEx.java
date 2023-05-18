
class Login {
	
	String usrName = "Dhiraj";
	int pass = 123;

	void loginPage() {
	
		if(usrName.equals("Dhiraj") && pass == 123) {

			System.out.println("Login SuccessFully");
		}
	}
	public static void main(String[] args) {
		
		Login obj = new Login();

		obj.loginPage();
	}
}
