/*
           
           *
	 * * *
       * * * * *
     * * * * * * *
   * * * * * * * * *
	 
 */

import java.util.Scanner;

class pattern{

	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int row = obj.nextInt();

		for(int i = 1; i <= row; i++){
			
			for(int j = 1; j <= row-i;j++){
				
				System.out.print("  ");
			}

			for(int k = 1; k <= i + (i - 1);k++){
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
