/*
 Program 7 : write a program to print the following pattern
	F
	E F
	D E F
	C D E F
	B C D E F
	A B C D E F
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){

                Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Numbers of rows : ");
                int row = obj.nextInt();
		int count = 1;

		char ch1 =(char)(4 + row);
		char ch2 = ch1;
                for(int i = 1; i <= row; i++){
			
			System.out.print(ch2 + " ");
			ch2++;
			if(i == count){
				i = 0;
				count++;
				ch1--;
				ch2 = ch1;
				System.out.println();
			}
			if(count - 1 == row){
				break;
			}
                }
        }
}

