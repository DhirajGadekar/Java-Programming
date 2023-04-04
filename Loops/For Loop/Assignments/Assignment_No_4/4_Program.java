/*
 Program 4 : write a program to print the following pattern
	3C 3C 3C 3C
	3C 3C 3C
	3C 3C
	3C
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Numbers of rows : ");
                int row = obj.nextInt();

                int count = row;
                for(int i = 1; i <= row; i++){

			System.out.print("3C  ");
			
			if(i == count){			
				i = 0;
				count--;
				System.out.println();
			}
			
			if(count == 0){
				
				break;
			}
		}
        }
}

