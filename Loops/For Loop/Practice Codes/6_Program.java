/*
 
 	 * * * * * * *
	 * *       * *          
	 *   *   *   *
	 *     *     *
	 *   *   *   *
	 * *       * *
	 * * * * * * *
  
 */

import java.util.Scanner;

class pattern{
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();

		for(int i = 1; i <= row; i++){

			for(int j = 1; j <= row; j++){
				
				if((j == i) || j == 1 || j == row || i == 1 || i == row || (row + 1) == (i + j)){
					
					System.out.print("*  ");
				}else{

					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
