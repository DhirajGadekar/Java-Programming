/*
           1
        2  3
     4  5  6
  7  8  9  10
 */

import java.util.Scanner;

class tripattern{

	public static void main(String[] args){
		
		int num = 1;
		int count = 1;
		int sp = 1;
		for(int i = 1; i <= 4;i++){
			
			if(count == sp){
				for(int j = 3;j >= sp;j--){
					System.out.print("  ");
				}
				sp++;
			}
			System.out.print(num + " ");
			num++;
			if(i == count){
				i = 0;
				count++;
				System.out.println();
			}
		        if((count - 1) == 4){
				
				break;
			}
		
		}
	}
}
