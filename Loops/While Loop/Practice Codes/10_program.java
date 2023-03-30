//Program 10 : Write a program to find the GCD (Greatest Common Divisor) of two given numbers.

import java.util.Scanner;

class GCD{
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the 1st number : ");
		int num1 = obj.nextInt();

		System.out.println("Enter the 2nd number : ");
		int num2 = obj.nextInt();

		int i = 1,common = 0;
		while(i <= num1 || i <= num2){
			
			if(num1 % i == 0 && num2 % i == 0){
				
				common = i;
			}
			i++;
		}
		System.out.println(common + " is the GCD of two given number");

	}
}
