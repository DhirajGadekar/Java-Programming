/*
 Program 8 : Write a program to remove the occurrences of a specified letter
	     Character.

	Input :
		Java Program
		character to remove : a
	
	Output :
		Jv Progrm
 */

import java.io.*;

class Solution {
	
	String removeOccurrence(String str,char key) {
		
		char arr[] = str.toCharArray();

		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == key) {
				
				count++;
				continue;
			} else {
				
				arr[i - count] = arr[i];
			}
		}
		for(int i = 1; i <= count; i++) {
			
			arr[arr.length - i] = ' ';
		}
		return new String(arr);
	}
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter a String : ");
		String str = br.readLine();
		
		System.out.println("Enter character to remove : ");
		char key = br.readLine().charAt(0);

		str = obj.removeOccurrence(str,key);
		System.out.println(str);
	}
}
