/*
 Program 3 : write a program to print the following pattern
	10
	10 9
	9 8 7
	7 6 5 4
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
                int row = obj.nextInt();
		
		int num = (row * row + row)/2;
		int count = 1;
                for(int i = 1; i <= row; i++){

                        System.out.print(num-- + "  ");

			if(i == count){
				i = 0;
				count++;
				num++;
				System.out.println();
			}
			if(count -1 == row){
				break;
			}
                }
        }
}

