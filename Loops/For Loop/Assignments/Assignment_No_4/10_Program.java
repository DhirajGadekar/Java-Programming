/*
 Program 10 : write a program to print the following pattern
	1 2 3 4
	4 5 6
	6 7
	7
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Numbers of rows : ");
                int row = obj.nextInt();

                int count = row;
		int num = 1;
                for(int i = 1; i <= row; i++){
			
			System.out.print(num + " ");
			num++;    
			if(i == count){
				i = 0;
				count--;
				num--;
				System.out.println();
			}
			if(count == 0){
				break;
			}
                }
        }
}

