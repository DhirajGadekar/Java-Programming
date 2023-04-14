/*
 Program 3 : write a program to print the following pattern
		5 4 3 2 1
		8 6 4 2
		9 6 3
		8 4
		5

		USE THIS FOR LOOP STRICTLY for the outer loop
		Int row;
		Take the number of rows from user
		for(int i =1;i<=row;i++){

		}
 */

import java.io.*;

class pattern{
	
	static void pattern(int row){
		
		int temp = row;

		for(int i = 1; i <= row; i++){
			int num = temp * i;
			for(int j = row; j >= i;j--){
				
				System.out.print(num + " ");
				num = num - i;
			}
			temp--;
			System.out.println();
		}
	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the row : ");
		int row = Integer.parseInt(br.readLine());

		pattern(row);
	}
}
