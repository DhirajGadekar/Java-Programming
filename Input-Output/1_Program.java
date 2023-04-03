//Scanner class through input/Output : 

import java.util.Scanner;

class inputDemo{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the Player name : ");
		String name = obj.nextLine();

		System.out.println("Enter the Player Grade : ");
		char grade = obj.next().charAt(0);

		System.out.println("Enter the Player average : ");
		float avg = obj.nextFloat();

		System.out.println("Name : " + name);
		System.out.println("Grade : " + grade);
		System.out.println("Average : " + avg);
	}
}
