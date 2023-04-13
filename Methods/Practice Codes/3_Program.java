/*
 Program 3 : Stronf NUmber in range
 */

import java.io.*;

class StrongNum{
	
	static void Strong_Number(int start,int end){
		
		for(int i = start; i <= end; i++){
			
			int temp = i;
			int sum = 0;
			while(temp != 0){
				
				int rem = temp % 10;
				int fact = 1;
				for(int j = 1 ; j <= rem; j++){
					
					fact = fact * j;
				}
				sum = sum + fact;
				temp = temp / 10;
			}
			if(i == sum){
				System.out.println(i);
			}

		}
	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the range : ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		Strong_Number(start,end);
	}
}
