import java.sql.*;
import java.io.*;
class AggregateFunction {
	
	private static Connection con;
	
	int totalStudents() {
		
		String q = "Select count(Name) from Student";
		try {
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);
			if(set.next()) {
			
				return set.getInt(1);
			} 
		} catch(Exception e) {

			e.printStackTrace();
		}
		return -1;
	}
	float avgMarks() {

		String q = "Select avg(marks) from Student";
		try {
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);
			if(set.next()) {
			
				return set.getFloat(1);
			} 
		} catch(Exception e) {

			e.printStackTrace();
		}
		return 0.0f;
	}
	void maxMarksDetails() {
		
		
		String q = "Select * from Student where marks = (Select max(marks) from Student)";
		try {
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);
			if(set.next()) {
			
				System.out.println("Roll No : " + set.getInt(1));
				System.out.println("Name : " + set.getString(2));
				System.out.println("Marks : " + set.getFloat(3));
			       	System.out.println("City : " + set.getString(4)); 
				System.out.println("Grade : " + set.getString(5));
			} else {
				
				System.out.println("Student Not Found....!");
			}	
		} catch(Exception e) {

			e.printStackTrace();
		}
	}
	void minMarksDetails() {

		String q = "Select * from Student where marks = (Select min(marks) from Student)";
		try {
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);
			if(set.next()) {
			
				System.out.println("Roll No : " + set.getInt(1));
				System.out.println("Name : " + set.getString(2));
				System.out.println("Marks : " + set.getFloat(3));
			       	System.out.println("City : " + set.getString(4)); 
				System.out.println("Grade : " + set.getString(5));
			} else {
				
				System.out.println("Student Not Found....!");
			}		
		} catch(Exception e) {

			e.printStackTrace();
		}
	}
	float sumMarks() {
		
		String q = "Select sum(marks) from Student";
		try {
			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);
			if(set.next()) {
			
				return set.getFloat(1);
			} 
		} catch(Exception e) {

			e.printStackTrace();
		}
		return 0.0f;
	}	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AggregateFunction obj = new AggregateFunction();

		String url = "jdbc:mysql://localhost:3306/College";
		String usr = "root";
		String pwd = "Dhiraj@7465";
		try {
			
			con = DriverManager.getConnection(url, usr, pwd);
			char ch;
			do {
				
				System.out.println("1. Count of Total Students : ");
				System.out.println("2. Average of Student Marks : ");
				System.out.println("3. Max Marks Student Details : ");
				System.out.println("4. Min Marks Student Details : ");
				System.out.println("5. Sum of Student Marks : \n");

				System.out.println("Enter your Choice : ");
				int choice = Integer.parseInt(br.readLine());

				switch(choice) {
					
					case 1 :
						System.out.println("Total Student Count : " + obj.totalStudents() + "\n");
						break;
					case 2 :
						System.out.println("Average of Student Marks: " + obj.avgMarks() + "\n");
						break;
					case 3 :
						obj.maxMarksDetails();
						break;
					case 4 :
						obj.minMarksDetails();
						break;
					case 5 :
						System.out.println("Sum of Student Marks : " + obj.sumMarks() + "\n");
						break;
					default :
						System.out.println("Wrong Choice");
				}
				System.out.println("Do want Continue : ");
				ch = (char)br.readLine().charAt(0);
			} while(ch == 'Y' || ch == 'y');
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
