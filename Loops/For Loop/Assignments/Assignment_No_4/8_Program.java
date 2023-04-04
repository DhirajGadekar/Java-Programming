/*
 Program 8 : write a program to print the following pattern
	J
	I H
	G F E
	D C B A
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Numbers of rows : ");
                int row = obj.nextInt();
		

		char ch = (char)(65 + ((row*row)+2)/2);

		int count = 1;
                for(int i = 1; i <= row; i++){
			
			System.out.print(ch + " ");
			ch--;
			
			if(i == count){
				i = 0;
				count++;
				System.out.println();
			}
			if(count- 1 == row){
				
				break;
			}
                }
        }
}

