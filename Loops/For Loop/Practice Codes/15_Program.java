/*
 	  *           *	
       *  *  *     *  *  *
    *  *  *  *  *  *  *  *  *  
 */

import java.util.Scanner;

class pattern{

	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();
		
		int num = 1;
		for(int i = 1; i <= row*row; i++){
			if(i <= row){
				for(int sp1 = row - 1; sp1 >= i; sp1--){
					System.out.print("   ");
				}
				for(int j = 1; j <= i + ( i - 1);j++){
					if(j == 1 && i == 1){
						System.out.print("   ");
					}else{
						System.out.print("*  ");
					}
				}
				for(int sp2 = row - i + 1; sp2 >= i; sp2--){
					System.out.print("   ");
				}
				for(int j = 1; j <= i + (i - 1);j++){
					if(j == 1 && i == 1){
						System.out.print("   ");
					}else if(i == row && j == i + (i - 1)){
						System.out.println(" ");
					}else{
						System.out.print("*  ");
					}
				}
			}else{

				for(int j = row + 1; j < i;j++){
					System.out.print("   ");
				}
				for(int k = row * row - 2 * num + 1;k >= 0;k--){
					System.out.print("*  ");
				}
				num++;
			}
			System.out.println();
		}		
	}
}


