/*
 
 *
 * *
 * * *
 * * * *
 * * *
 * *
 *
 
 */

import java.util.Scanner;

class patter{
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();
		
		int col = 1;
		for(int i = 1; i <= row * 2 - 1; i++){
			
			if(i <= row){
				col = i;
			}else{
				col = row * 2 - i;
			}

			for(int j = 1; j <= col;j++ ){
				
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}
