import java.sql.*;

class SelectQuery {
	
	public static void main(String[] args) {
	
		String url = "jdbc:mysql://localhost:3306/College";
		String usr = "root";
		String pwd = "Dhiraj@7465";

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, usr, pwd);

			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery("Select * from Student");

			while(set.next()) {
				
				System.out.println(set.getInt(1) + " : " + set.getString(2) + " : " + set.getFloat(3) + " : " + set.getString(4) + " : " + set.getString(5));
			}
			con.close();
		} catch(Exception obj) {
		

		}
	}
}
