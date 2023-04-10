/*
 Program 9 : StringTokenizer
 */

import java.io.*;
import java.util.*;

class StudentInfo{
	
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Student Name,Attentance,CGPA,Grade : ");
		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info, ",");

		String name = obj.nextToken();
		int Att = Integer.parseInt(obj.nextToken());
		float CGPA = Float.parseFloat(obj.nextToken());
		char grade = obj.nextToken().charAt(0);

		System.out.println("Name : " + name);
		System.out.println("Attendance : " + Att);
		System.out.println("CGPA : " + CGPA);
		System.out.println("Grade : "+ grade);
	}
}
