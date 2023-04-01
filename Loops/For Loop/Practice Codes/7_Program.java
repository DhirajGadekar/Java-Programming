/*
 	  *	* * * * 
 	  *  	*
 	  *	*
 	  * * *	* * * * 
 		*     *
 		*     *
 	  * * * *     *
 */

import java.util.Scanner;

class pattern{

	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();

		for(int i = 1; i <= row; i++){
			
			for(int j = 1; j <= row; j++){
				
				if((i == (row + 1)/2) || (j == (row + 1)/2) || (j == 1 && (row + 1)/2 >= i) || (i == 1 && (row + 1)/2 <= j) || (i == row && (row + 1)/2 >= j) || (j == row && (row + 1)/2 <= i)){
	
					System.out.print("* ");
				}else{

					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
