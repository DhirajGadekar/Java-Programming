/*
 		*
	      *   *
	    *       *
	  *           *
	* * * * * * * * *           
 */


import java.util.Scanner;

class pattern{

	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();

		for(int i = 1; i <= row;i++){
			
			for(int sp = 1; sp <= row - i;sp++){
				
				System.out.print("  ");
			}		
			for(int j = 1; j <= i + ( i - 1);j++){
				
				if(j == 1 || j == i + ( i - 1) || i == row){
					
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}	
