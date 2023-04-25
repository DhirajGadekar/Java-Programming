/*
 Prpgram 10 : Write a program to take range as input from the user and print Armstrong numbers. ( Take a start and
	      end number from a user)
		Input: Enter start: 1
		       Enter end: 1650
		Output: Armstrong numbers between 1 and 1650
			1 2 3 4 5 6 7 8 9 153 370 371 407 1634 
 */

import java.io.*;

class Armstrong{

	void ArmStrong_Num(int start, int end){

		for(int i = start; i <= end; i++){

			int temp = i;
			int sum = 0;
			int count = 0;

			while(temp != 0){
				count++;
				temp = temp/10;
			}

			temp = i;
			while(temp != 0){

				int rem = temp % 10;

				int mult = 1;
				for(int j = 1; j <= count; j++){

					mult = mult * rem;
				}
				sum = sum + mult;
				temp = temp / 10;
			}
			if(i == sum){
				System.out.println(i);
			}
		}

	}
	public static void main(String[] args)throws IOException{

		BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));
		Armstrong obj2 = new Armstrong();

		System.out.println("Enter the Start : ");
		int start = Integer.parseInt(obj1.readLine());
		System.out.println("Enter the End : ");
		int end = Integer.parseInt(obj1.readLine());

		obj2.ArmStrong_Num(start,end);
	}
}

