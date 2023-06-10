/*
 Program 9 : Write a program to remove duplicate characters from string.

	Input :
		String : core2web technologies

	Output :
		core2wb thnlgis
 */

import java.io.*;

class Solution {

	boolean isPresent(char arr[], int itr, char key) {
		
		int count = 0;
		for(int i = 0 ; i < itr; i++) {

			if(arr[i] == key) {

				return false;
			}
		}
		return true;
	}
	String removeDuplicateChar(String str) {
		
		char arr[] = new char[str.length()];

		arr[0] = str.charAt(0);

		int itr = 1;
		for(int i = 1; i < arr.length;i++) {
			
			if(isPresent(arr,i,str.charAt(i))) {
				
				arr[itr] = str.charAt(i);
				itr++;
			}
		}
		
		return new String(arr);
	}
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter String : ");
		String str = br.readLine();

		str = obj.removeDuplicateChar(str);
		System.out.println(str);
	}
}
