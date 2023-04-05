/*
 Program 7 : write a program to print the following pattern
	F
	E 1
	D 2 E
	C 3 D 4
	B 5 C 6 D
	A 7 B 8 C 9
 */

import java.util.Scanner;

class pattern{

        public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
                int row = obj.nextInt();
		
		int count = 1;
		char ch = (char)(64 + row);
		char ch1 = ch;
		int num = 1;
                for(int i = 1; i <= row; i++){
		
                	if(i % 2 == 1){
				
				System.out.print(ch1++ + " ");
			}else{
				System.out.print(num++ + " ");
			}	
			if(i == count){
				i = 0;
				count++;
				ch--;
				ch1 = ch;
				System.out.println();
			}
			if(count-1 == row){
				break;
			}
                }
        }
}

