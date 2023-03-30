//Program 11 : Write a program to find the LCM (Least Common Multiple) of two numbers.

import java.util.Scanner;

class LCM{

	public static void main(String[] args){
		
		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter the First Number : ");
		int num1 = Obj.nextInt();

		System.out.println("Enter the Sec Number : ");
		int num2 = Obj.nextInt();
		
		int i = 1,common = 0;
		while(i <= num1 || i <= num2){
			
			if(num1 % i == 0 && num2 % i == 0){
				
				common = i;
			}
			i++;
		}
		int LCM = (num1 * num2) / common;
		System.out.println("LCM of "+ num1 + " & " + num2 + " is " + LCM);
	}
}
