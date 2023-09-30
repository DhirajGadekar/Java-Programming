
import java.io.*;
import java.sql.*;

class InsertValue {
	
	void addData(Connection con) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int rollno = 0;
		String name = null;
		float marks = 0.0f;
		String city = null;
		String grade = null;
		try {
			System.out.print("Enter Roll No : ");
			rollno = Integer.parseInt(br.readLine());
			
			System.out.print("Enter Name : ");
			name = br.readLine();
			
			System.out.print("Enter Marks : ");
			marks = Float.parseFloat(br.readLine());
			
			System.out.print("Enter City : ");
			city = br.readLine();
			
			System.out.print("Enter Grade : ");
			grade = br.readLine();

		} catch(IOException ioe) {
			
			ioe.printStackTrace();
		}
		try {
			String q = "Insert into Student (Name, marks, city, grade) value (?, ?, ?, ?)";

                        PreparedStatement psmt = con.prepareStatement(q);

			//psmt.setInt(1, rollno);
			psmt.setString(1, name);
                	psmt.setFloat(2, marks);
                	psmt.setString(3, city);
                	psmt.setString(4, grade);

               		int num = psmt.executeUpdate();
		
         		System.out.println("No row Affected : " + num);
			con.close();
		} catch(SQLIntegrityConstraintViolationException e) {
			
			System.out.println("Enter Different Roll no : ");
		} catch(Exception e) {
			
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		
		InsertValue iv = new InsertValue();
		String url = "jdbc:mysql://localhost:3306/College";
		String usr = "root";
		String pwd = "Dhiraj@7465";

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, usr, pwd);

			iv.addData(con);
			con.close();
		} catch(Exception e) {
		
			e.printStackTrace();
		}
	}
}
