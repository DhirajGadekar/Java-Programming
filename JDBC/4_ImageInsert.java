import java.sql.*;
import java.io.*;
class ImageInsert {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/College";
		String usr = "root";
		String pwd = "Dhiraj@7465";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, usr, pwd);

			String q = "Insert into StudentImage (image) value(?)";
			
			PreparedStatement psmt = con.prepareStatement(q);

			FileInputStream file = new FileInputStream("profile.jpeg");

			psmt.setBinaryStream(1, file, file.available());

			int num = psmt.executeUpdate();
			System.out.println(num);
			con.close();
		} catch(Exception e) {

		}
	}
}
