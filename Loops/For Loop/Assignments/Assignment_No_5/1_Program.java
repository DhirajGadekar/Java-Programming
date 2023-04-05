/*
 Program 1 : write a program to print the following pattern
	C2W10
	C2W9 C2W8
	C2W7 C2W6 C2W5
	C2W4 C2W3 C2W2 C2W1
 */

import java.util.Scanner;

class pattern{

	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int row = obj.nextInt();
		
		int num = (row * row + row) / 2;
		int count = 1;
		for(int i = 1; i <= row; i++){
		
			System.out.print("C2W" + num-- + "  ");

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
