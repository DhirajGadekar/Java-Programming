//Program 12 : Automorphic Number : 

import java.util.Scanner;

class automorphic{
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);	

		System.out.println("Enter the Number : ");
		int N = obj.nextInt();	
		int temp = N;
		int sqr = N * N;
		int sum1 = 0, sum2 = 0;

		while(N != 0){
			
			int rem1 = N % 10;
			int rem2 = sqr % 10;

			sum1 = (sum1 * 10) + rem1;
			sum2 = (sum2 * 10) + rem2;

			N /= 10;
			sqr /= 10;
		}
		if(sum1 == sum2){
			
			System.out.println(temp + " is Automorphic Number");
		}else{

			System.out.println(temp + " is Not Automorphic Number");
		}
	}
}
