/*
 Prpgram 6 : Write a program to take 5 numbers as input from the user and print the count of digits in those
		numbers.
		Input:  Enter 5 numbers :
			5
			The digit count in 5 is 1
			25
			The digit count in 25 is 2
			225
			The digit count in 225 is 3
			6548
			The digit count in 6548 is 4
			852347
			The digit count in 852347 is 6  
*/

import java.io.*;

class NestedAssignment{

        static void CountDigit(int range)throws IOException{
		
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 1; i <= range; i++){

			System.out.println("Enter the number : ");
			int num = Integer.parseInt(br.readLine());
			int count = 0;
			int temp = num;
			while(num != 0){
				count++;
				num /= 10;
			}
			System.out.println("The digit count in "+temp+" is "+count);
		}
        }
        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the range :");
		int range = Integer.parseInt(br.readLine());

		CountDigit(range);
        }
}
