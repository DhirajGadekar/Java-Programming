import java.sql.*;

class JDBCDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
	
		String url = "jdbc:mysql://localhost:3306/College";
		String usr = "root";
		String pwd = "Dhiraj@7465";

		try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, usr, pwd);

			if(con.isClosed()) {
				
				System.out.println("Connection is Closed");
			} else {
				
				System.out.println("Connection is Created");
			}
		} catch(SQLException s) {
			
			s.printStackTrace();
		}
	}
}
