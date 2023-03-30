//Program 8 : Write a program to find the factorial of a given number.

import java.util.Scanner;

class Factorial{
	
	public static void main(String[] args){
		
		Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = Obj.nextInt();

		int mul = 1; 
		while(num >= 1){
			
			mul *= num;
			num--;
		}
		System.out.println("Factorial is " + mul);

	}
}

