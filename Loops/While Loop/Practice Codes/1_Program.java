//Program 1 : Prime Number

import java.util.Scanner;

class PrimeNumber{

	public static void main(String[] args){
	
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = obj.nextInt();
		
		int i = 1,count = 0;
		while(i <= num){
			
			if(num % i == 0){
				count++;
			}
			if(count > 2){
				break;
			}
			i++;
		}

		if(count == 2){
			
			System.out.println(num + " is Prime Number");
		}else{

			System.out.println(num + " is Nonprime Number");
		}
	}
}
