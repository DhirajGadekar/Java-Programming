/*
 Program 4 : Perfect Number In Range : 
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

		System.out.println("Enter the Range : ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		Perfect_Number(start,end);
	}
}
