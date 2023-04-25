/*
 Prpgram 5 : Write a program to take range as input from the user and print perfect numbers.
	     {Note: Perfect number is the one whose perfect divisor’s addition is equal to that number.
	      6 is perfect number = 1 + 2 + 3 = 6}
		Input: Enter start: 1
		       Enter end: 30
		Output: perfect numbers between 1 and 30
			6 28
 */

import java.io.*;

class PerfectNumber{

	static void Perfect_Number(int start, int end){

		System.out.println("Perfect Number between the " + start + " to " + end +" : ");

		for(int i = start; i <= end; i++){

			int sum = 0;
			for(int j = 1; j < i ; j++){

				if(i % j == 0){
					sum = sum + j;	
				}	
			}
			if(i == sum){
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter the End : ");
		int end = Integer.parseInt(br.readLine());

		Perfect_Number(start,end);
	}
}
