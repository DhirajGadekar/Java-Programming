/*
 Program 9 : write a program to print the following pattern
	1
	8 27
	64 125 216
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Numbers of rows : ");
                int row = obj.nextInt();

                int count = 1;
		int num = 1;
                for(int i = 1; i <= row; i++){

			System.out.print((num * num * num) + " ");
			num++;
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

