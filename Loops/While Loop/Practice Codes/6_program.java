//Program 6 : Write a program to find all the prime numbers between two given numbers.

import java.util.Scanner;

class primeNumber{

	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the 1st Number : ");
		int num1 = obj.nextInt();

		System.out.println("Enter the 2nd Number : ");
		int num2 = obj.nextInt();
	
		System.out.println("Prime Numbers are : ");
		if(num1 <= num2){
			
			while(num1 <= num2){
				
				int i = 1,count = 0;
				while(i <= num1){
					
					if(num1 % i == 0){
						count++;
					}
					i++;
				}
				if(count == 2){
					System.out.println(num1);
				}
				num1++;
			}
		}else{

			System.out.println("Enter Valid Range like 1st is small and 2nd Greater");
		}
	}
}
