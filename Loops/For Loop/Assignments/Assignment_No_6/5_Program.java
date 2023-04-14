/*
 Program 5 : write a program to print the following pattern
		Row =4
		0
		1 1
		2 3 5
		8 13 21 34
		USE THIS FOR LOOP STRICTLY for the outer loop
		Int row;
		Take the number of rows from user
		for(int i =1;i<=row;i++){

		}
 */

import java.io.*;

class fibonacii{

	static void fiboPattern(int row){
		
		int a1 = 0,a2 = 1;
		for(int i = 1; i <= row; i++){
			
			for(int j = 1; j <= i; j++){
				
				System.out.print(a1 + " ");
				int sum = a1 + a2;
				a1 = a2;
				a2 = sum;
			}
			System.out.println();
		}
	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number row : ");
		int row = Integer.parseInt(br.readLine());

		fiboPattern(row);
	}
}
