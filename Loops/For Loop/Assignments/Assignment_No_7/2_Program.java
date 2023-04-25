/*
 Prpgram 2 : Write a program to take range as input from the user and print composite numbers.
		Input: Enter start: 1
		       Enter end: 20
		Output: composite numbers between 1 and 20
			4 6 8 9 10 12 14 15 16 18 20  
 */

import java.io.*;

class Composite{

	static void Composite_num(int start,int end){
		
		System.out.println("Composite Number Range in Between " + start + " to " + end + " : ");
		for(int i = start; i <= end; i++ ){
			
			int count = 0;
			for(int j = 1; j <= i; j++){

				if(i % j == 0){
					
					count++;
				}	
			}
			if(count > 2){
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args)throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the start : ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter the end : ");
		int end = Integer.parseInt(br.readLine());
		
		Composite_num(start,end);
	}
}
