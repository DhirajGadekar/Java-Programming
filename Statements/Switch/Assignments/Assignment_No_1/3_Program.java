/*
 Program 3 : Write a program in which user should enter two numbers if both the numbers are positive
	     multiply them and provide to switch case to verify number is even or odd, if user enters 
	     any negative number program should terminate saying “Sorry negative numbers not allowed”
 */

import java.io.*;

class NumberChecker {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number 1st : ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter the Number 2nd : ");
		int num2 = Integer.parseInt(br.readLine());

		if(num1 > 0 && num2 > 0) {
			
			switch((num1 * num2) % 2) {
				
				case 0 :

					System.out.println("Even Number");
					break;
				case 1:
					System.out.println("Odd Number");
					break;
			}
		}else {
			
			System.out.println("Sorry negative numbers not allowed");
		}
	}
}
