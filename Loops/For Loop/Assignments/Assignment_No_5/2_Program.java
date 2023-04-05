/*
 Program 2 : write a program to print the following pattern
	1
	3  4
	6  7  8
	10 11 12 13
	15 16 17 18 19
 */

import java.util.Scanner;

class pattern{
        
        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();
		
		int num = 1;
		int count = 1;
                for(int i = 1; i <= row; i++){
                
                        System.out.print(num + " ");
			num++;

			if(i == count){
				num++;
				i = 0;
				count++;
				System.out.println();
			}
			if(count - 1 == row){
				break;
			}
                }
        }
}  
