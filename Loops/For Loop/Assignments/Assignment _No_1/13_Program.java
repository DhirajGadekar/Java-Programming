//Program 13 : Strong Number

import java.util.Scanner;

class strongNum{
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = obj.nextInt();
		int temp = num;
		int sum = 0;

		while(num != 0){
			
			int rem = num % 10;
			int mul = 1;
			for(int i = 1;i <= rem; i++){

				mul = mul * i;
			}
			sum = sum + mul;
			num /= 10;
		}		
		if(temp == sum){
			
			System.out.println(temp + " is Strong Number");
		}else{

			System.out.println(temp + " is Not Strong Number");
		}
	}
}
