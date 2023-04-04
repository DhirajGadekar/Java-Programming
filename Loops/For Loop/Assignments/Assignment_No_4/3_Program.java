/*
 Program 3 : write a program to print the following pattern
	10
	9 8 
	7 6 5
	4 3 2 1
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Numbers of rows : ");
                int row = obj.nextInt();
		
		int count = 1;
		int num = 10;
                for(int i = 1; i <= row; i++){
			
			System.out.print(num + " ");
			num--;

			if(i == count){
				count++;
				i = 0;
				System.out.println();
			}
			if(count - 1 == row){
	
				break;
			}
                        
                }
        }
}

