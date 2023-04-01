/*
 
 * * * * *
 * * * *
 * * *
 * *
 *
 * *
 * * * 
 * * * *
 * * * * *
 
 */

import java.util.Scanner;

class pattern{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();
		
		int col ;
		for(int i = 1; i <= row * 2 - 1; i++){
			
			if(i <= row){
				
				col = row - i + 1;
			}else{
				col = i - row + 1;
			}
			for(int j = 1; j <= col; j++){
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
