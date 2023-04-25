/*
 Prpgram 3 : Write a program to take a range as input from the user and print perfect squares between that range.
		Input: Enter start: 1
		       Enter end: 100
		Output: perfect squares between 1 and 100  
 */

import java.io.*;

class PerfectNumber{

	static void Perfect_Number(int start, int end){

		System.out.println("Perfect Square between the " + start + " to " + end +" : ");

		for(int i = start; i*i <= end; i++){

				
			System.out.println(i * i);
		}

	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter the end : ");
		int end = Integer.parseInt(br.readLine());

		Perfect_Number(start,end);
	}
}
