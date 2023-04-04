/*
 Program 5 : write a program to print the following pattern
	10 10 10 10
	11 11 11
	12 12
	13
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Numbers of rows : ");
                int row = obj.nextInt();

                int count = row;
		int num = 10;
                for(int i = 1; i <= row; i++){
			
			System.out.print(num + " ");
                        
			if(i == count){
				i = 0;
				count--;
				num++;
				System.out.println();
			}
			if(count == 0){
				break;
			}
                }
        }
}

