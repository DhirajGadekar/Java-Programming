/*
Program 1 : WAP to take a character array as input, but only print characters do not
	    print special characters
	
	Input: a b $ % c & d 1 e
	Output : a b c d e
	Hint: you can take two arrays
*/
import java.io.*;

class Solution {
	
	void printCharOnly(char arr[] ) {
		
		System.out.println("Array elements : ");

		for(int i = 0; i < arr.length; i++) {

			if((arr[i] >= 'A' && arr[i] <= 'Z') || arr[i] >= 'a' && arr[i] <= 'z') {

				System.out.println(arr[i]);
			}
		}
	}
}
class ArrayAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Solution obj = new Solution();

		System.out.println("Enter the length of an Array : ");
		int n = Integer.parseInt(br.readLine());

		char arr[] = new char[n];

		System.out.println("Enter the array Elements : ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = br.readLine().charAt(0);
		}

		obj.printCharOnly(arr);
	}
}
