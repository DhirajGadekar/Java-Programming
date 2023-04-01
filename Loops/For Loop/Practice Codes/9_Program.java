/*
 
   * * * * * * * 
     * * * * * 
       * * * 
         *
 */

import java.util.Scanner;

class pattern{
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();

		for(int i = 1; i <= row;i++){
			
			for(int j = 1;j < i;j++){
				System.out.print("  ");
			}
			for(int k = 2 * row - 2 * i + 1; k >= 1;k--){
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
