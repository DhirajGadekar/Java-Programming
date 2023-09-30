import java.io.*;
import java.sql.*;

class UpdateData {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String url = "jdbc:mysql://localhost:3306/College";
		String usr = "root";
		String pwd = "Dhiraj@7465";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, usr, pwd);

			String q = "Update Student Set grade = ? where Roll_No = ?";

			PreparedStatement psmt = con.prepareStatement(q);

			System.out.println("Enter New Grade : ");
			String grade = br.readLine();

			System.out.println("Enter Roll_No : ");
			int Roll_No = Integer.parseInt(br.readLine());

			psmt.setString(1, grade);
			psmt.setInt(2, Roll_No);

			int num = psmt.executeUpdate();
			
			System.out.println(num);
			
			con.close();
		} catch(Exception e) {

		}
	}
}
