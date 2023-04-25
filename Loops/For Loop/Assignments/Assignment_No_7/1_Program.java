/*
 Prpgram 1 : Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
	     count of even numbers.
		Input: Enter a lower limit: 1
		       Enter upper limit: 50
		Output: 10, 20, 30, 40, 50
			Count = 5 
 */

import java.io.*;

class NestedAssignment{
	
	static int EvenDiv(int lower,int upper){
		
		int count = 0;
		System.out.println("Numbers divisible by 5 from " + lower + " to " + upper+ " & the number is even : ");
		for(int i = lower;i <= upper; i++){
			
			if(i % 5 == 0){
				
				if(i % 2 == 0){
					System.out.println(i);
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a lower limit:");
		int lower = Integer.parseInt(br.readLine());
		
		System.out.println("Enter a upper limit:");
		int upper = Integer.parseInt(br.readLine());

		int count = EvenDiv(lower,upper);
		System.out.println("Count : " + count);
	}
}
