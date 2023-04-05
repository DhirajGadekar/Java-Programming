/*
 Program 4 : write a program to print the following pattern
	1 2 3 4
	2 3 4
	3 4
	4
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of rows : ");
                int row = obj.nextInt();

		int count = row;
		int num = 1;
		int num1 = num;
                for(int i = 1; i <= row; i++){

                       System.out.print(num1++ + " ");

		       if(i == count){
				i = 0;
				count--;
				num++;
				num1 = num;
				System.out.println();
		       }
		       if(count == 0){
				break;
		       }
                }
        }
}

