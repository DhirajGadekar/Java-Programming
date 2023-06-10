/*
 Program 6 : Write a program in Java to check whether a given string is
	     palindrome or not.

	Input :
		racecar

	output:
		racecar is a Palindrome String
 */

import java.io.*;

class Solution {
	
	//Without Using Library Methods :
	boolean isEquals(char arr[], String str1) {
			
		char str[] = str1.toCharArray();

		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == str[i]) {
				
				flag = true;
			} else {
				
				flag = false;
				break;
			}
		}
		if(flag) {
			
			return true;
		} else {
			
			return false;
		}
	}
	boolean palindromeString(String str) {
		
		char arr[] = str.toCharArray();
		
		int start = 0;
		int end = arr.length - 1;

		while(start < end) {
			
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		if(isEquals(arr,str)) {
			
			return true;
		} else {
			
			return false;
		}
	}

	//Using Library Methods : 
	
	/*boolean palindromeString(String str1) {
			
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse();

		String str2 = new String(sb);

		if(str1.equals(str2)) {

			return true;
		} else {
			
			return false;
		}
	}*/
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter the String  : ");
		String str = br.readLine();

		boolean ret = obj.palindromeString(str);
		if(ret) {
			
			System.out.println("String is Palindrome");
		} else {

			System.out.println("String is Non Palindrome");
		}
	}
}
