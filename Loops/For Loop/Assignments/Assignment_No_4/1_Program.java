/*
 Program 1 : write a program to print the following pattern
	C2W
	C2W C2W
	C2W C2W C2W
	C2W C2W C2W C2W
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
                int row = obj.nextInt();

		int count = 1;
                for(int i = 1; i <= row; i++){

                        System.out.print("C2W ");

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

