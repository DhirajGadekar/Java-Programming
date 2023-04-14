/*
 Program 1 : write a program to print the following pattern
	D4 C3 B2 A1
	A1 B2 C3 D4
	D4 C3 B2 A1
	A1 B2 C3 D4

	USE THIS FOR LOOP STRICTLY for the outer loop
	Int row;
	Take the number of rows from user
	for(int i =1;i<=row;i++){

	}
 */

import java.io.*;

class pattern{

	static void pattern(int row){
		
		int num = row + 1;
		char ch = (char)(64 + row);
		for(int i = 1 ; i <= row; i++){
			
			for(int j = 1; j <= row; j++){
				
				if(i % 2 == 1){
					num--;
					System.out.print(ch + "" + num + " ");
					ch--;
				}else{
		
					ch++;
					System.out.print(ch + "" + num + " ");
					num++;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number of Rows : ");
		int row = Integer.parseInt(br.readLine());

		pattern(row);
	}
}
