//Program 9 :Write a program to find the Fibonacci series up to a given number.

import java.util.Scanner;

class fibonacci{
	
	public static void main(String[] args){

		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int num = Obj.nextInt();

		int num1 = 0,num2 = 1;
		
		int i = 1;
		System.out.println("Finonacci Series is : ");
		while(i <= num){
			
			System.out.print(num1 + " ");
			
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;

			i++;
		}
	}
}
