/*
  Program 9 : Write a program to take a number as input and print the Addition of Factorials of each
	      digit from that number.
	      Input: 1234
	      Output: Addition of factorials of each digit from 1234 = 33 
 */

import java.io.*;

class factorialSum{
	
	static void factorialSum(int num){
		
		int sum = 0;
		int temp = num;
		while(num != 0){
			
			int rem = num % 10;
			int fact = 1;
			for(int i = 1; i <= rem; i++){
				
				fact = fact * i;
			}
			sum = sum + fact;
			num /= 10;
		}
		System.out.println("Addition of factorials of each digit from " + temp + " = " + sum);
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number : ");
		int num = Integer.parseInt(br.readLine());

		factorialSum(num);
	}
}
