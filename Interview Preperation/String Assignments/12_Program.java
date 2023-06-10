/*
 Program 12 : WAP that accepts a String from the user and prints the length of the string.
	
	Input: 
		heaven is just an illusion made by weak hearts
	
	Output: 
		The Length of entered String is 46
 */

import java.io.*;

class Solution {
	
	//Without Using Library Method :
	int isLength(String str) {
		
		char arr[] = str.toCharArray();
			
		int count = 0;
		for(int i = 0 ; i < arr.length; i++) {
			
			count++;
		}
		return count;
	}
}
class StringAssignment {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Solution obj = new Solution();

		System.out.println("Enter String : ");
		String str = br.readLine();

		int ret = obj.isLength(str);
		System.out.println("Length of String : " + ret);

		/*Using Library Method : 
		System.out.println("Length of String : " + str.length()); */
	}
}
