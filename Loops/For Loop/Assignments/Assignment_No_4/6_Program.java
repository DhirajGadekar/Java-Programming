/*
 Program 6 : write a program to print the following pattern
	9
	9 8
	9 8 7
	9 8 7 6
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){

                Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Numbers of rows : ");
                int row = obj.nextInt();

		int count = 1;
                for(int i = 1; i <= row; i++){

			System.out.print((10 - i) + " ");
			
			if(i == count){
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

