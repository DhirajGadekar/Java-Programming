/*
 Program 1 : Prime number in range 
 */

import java.io.*;

class Primenum{

	static void prime_Num(int start,int end){
		
		System.out.println("Prime Number Range Between " + start + " to " + end + " : ");
		for(int i = start; i <= end; i++){
			int count = 0;
			for(int j = 1; j <= i;j++){
				
				if(i % j == 0){
					count++;
				}
			}
			if(count == 2){
				
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the range : ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		prime_Num(start,end);
	}
}
