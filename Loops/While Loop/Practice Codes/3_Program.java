//Program 3: Amstrong Number

import java.util.Scanner;

class Amstrong{
	
	public static void main(String[] args){

		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num = Obj.nextInt();
		
		int num1 = num;
		int count = 0;
		
		while(num != 0){
			count++;
			num = num / 10;

		}

		int temp  = num1,sum = 0;
		while(num1 != 0){
			
			int rem1 = num1 % 10;
			int count1 = count,result = 1;
			while(count1 > 0){

				result *= rem1;
				count1--;
			}

			sum = result + sum;
			num1 = num1 / 10;

		}
		
		if(sum == temp){
			
			System.out.println(temp + " is Amstrong Number");
		}else{

			System.out.println(temp + " is Not Amstrong Number");
		}
	}
}
