/*
 Program 9 : write a program to print the following pattern
	1
	8 9
	27 16 125
	64 25 216 49
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){

                Scanner obj = new Scanner(System.in);
                System.out.println("Enter the Number of Rows : ");
                int row = obj.nextInt();

                int count = 1;
                for(int i = 1; i <= row; i++){

                        if(i % 2 == 0){
                                System.out.print((count + i - 1)*(count + i - 1) + " ");
                        }else{

                                System.out.print((count + i - 1)*(count + i - 1)*(count + i - 1) + " ");
                        }
                        if(i == count){
                                i = 0;
                                count++;
                                System.out.println();
                        }
                        if(count -1 == row){
                                break;
                        }
                }
        }
}

