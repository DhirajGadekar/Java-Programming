/*
 Program 2 : Write a Program to reverse a given String.
	
 	Input String:
		Core2Web Tech

	Output String:
		hcet beW2eroC
 */

import java.io.*;

class Solution {
		
	//Without use of Predefine Methods : 
	String reverseString(String str) {
		
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
		str = new String(arr);
		return str;
	}

	//Using predefine Methods : 
	/*String reverseString(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();

		str = new String(sb);

		return str;
	}*/

}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter the String : ");
		String str = br.readLine();

		str = obj.reverseString(str);
		System.out.println("Reverse String : " + str);
	}
}
