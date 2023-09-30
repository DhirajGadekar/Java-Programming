import java.sql.*;

class CreateTable {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/College";
		String usr = "root";
		String pwd = "Dhiraj@7465";

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, usr, pwd);

			Statement smt = con.createStatement();
			String query = "Create Table Student(Roll_No int(4) not null, Name varchar(100) not null, marks float not null, city varchar(50), grade varchar(2))";

			smt.executeUpdate(query);
			System.out.println("Table Created...");

			con.close();
		} catch(ClassNotFoundException cnf) {

			System.out.println("Class Not Found...");
		} catch(Exception se) {
			
			se.toString();
		}
	}
}
