//Program 7 : Write a program to check if a given number is a strong number or not.

import java.util.Scanner;

class strongNumber{

	public static void main(String[] args){
		
		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = Obj.nextInt();
		
		int temp = num;
		int sum = 0;
		while(num != 0){
			
			int rem = num % 10;
			int mul = 1;
			while(rem >= 1){
				
				mul = rem * mul;
				rem--;
			}
			sum = sum + mul;
			num /= 10;
		}
		if(sum == temp){
			System.out.println(temp +" is Strong Number");
		}else{
			System.out.println(temp + " is Not Strong Number");
		}
	}
}
