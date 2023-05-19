/*
 Program 5 : Write a real time time example which shows a index like above code
	     Also solve all codes using if else ladder
 */

import java.io.*;

class BuildingLift {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Floors :");
		System.out.println("0.Ground Floor");
		System.out.println("1.First Floor");
		System.out.println("2.Second Floor");
		System.out.println("3.Third Floor");
		System.out.println("4.Fourth Floor");
		
		System.out.println("\nEnter Floor Number :");
		int choice = Integer.parseInt(br.readLine());
		
		switch(choice) {
			
			case 0 :
				System.out.println("Your arrived in Ground floor");
				break;
			case 1 :
				System.out.println("Your arrived in First floor");
				break;
			case 2 :
				System.out.println("Your arrived in Second floor");
				break;
			case 3 :
				System.out.println("Your arrived in Third floor");
				break;
			case 4 :
				System.out.println("Your arrived in Fourth floor");
				break;
			default :
				System.out.println("Invalid Choice");
		}
	}
}
