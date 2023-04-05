/*
 Program 5 : write a program to print the following pattern
	A B C D
	B C D
	C D
	D
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
                int row = obj.nextInt();
		
		int count = row;
		char ch = 'A';
                for(int i = 1; i <= row; i++){

                        System.out.print(ch++ + " ");

			if(i == count){
				i = 0;
				count--;
				ch = (char)(ch - count);
				System.out.println();
			}
			if(count == 0){
				break;
			}
                }
        }
}

