/*
 Program 8 : write a program to print the following pattern
	10
	I H
	7 6 5
	D C B A
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
                int row = obj.nextInt();

		int count = 1;
		int num = (row * row + row)/2;
                for(int i = 1; i <= row; i++){

                	if(count % 2 == 1){
				
				System.out.print(num +"  ");
			}else{	
				System.out.print((char)(num + 64) +"  ");
			}
			num--;
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

