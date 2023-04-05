/*
 Program 6 : write a program to print the following pattern
	1
	2 3
	3 4 5
	4 5 6 7
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();

		int count = 1;
		int num = count;
                for(int i = 1; i <= row; i++){

                        System.out.print(num++ + " ");
			if(i == count){
				i = 0;
				count++;
				num = count;
				System.out.println();
			}
			if(count - 1 == row){
				break;
			}
                }
        }
}

