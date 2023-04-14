/*
 Prorgam 6 : Write a program, and take two characters if these characters are equal then print them as it is but if
		they are unequal then print their difference.
		{Note: Consider Positional Difference Not ASCIIs}

		Input: a p
		Output: The difference between a and p is 15
 */

import java.io.*;

class charDiff{

	static void charDifference(char ch1, char ch2){
		
		if(ch1 == ch2){
			
			System.out.println(ch1 + " & " + ch2 + " are equal" );
		}else{
			
			if(ch1 > ch2){
				
				System.out.println("The difference between " + ch1 + " & " + ch2 + " is " + (ch1 - ch2));
			}else{

				System.out.println("The difference between " + ch1 + " & " + ch2 + " is " + (ch2 - ch1));
			}
		}

	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the 1st character : ");
		char ch1 = (char)br.read();

		br.skip(1);
		
		System.out.println("Enter the 2nd character : ");
		char ch2 = (char)br.read();
		br.skip(1);
		charDifference(ch1,ch2);
	}
}
