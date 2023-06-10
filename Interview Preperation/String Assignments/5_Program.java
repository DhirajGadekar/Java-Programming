/*
 Program 5 : Write a program to capitalize the first letter of each word present in the String.

	Input :
		good morning coders
		
	Output :
		Good Morning Coders
 */

import java.io.*;

class Solution {
	
	//Without Using Library Methods : 
	String firstLetterCapitalize(String str) {
		
		char arr[] = str.toCharArray();
		
		char key  = ' ';
		for(int i = 0; i < arr.length; i++) {
			
			if(i == 0) {			
				if(arr[i] >= 'a' && arr[i] <= 'z') {
				
					arr[i] = (char)(arr[i] - 32);
				} 
			} else if(key == arr[i]) {
				
				if(arr[i + 1] >= 'a' && arr[i + 1] <= 'z') {
					
					arr[i + 1] = (char)(arr[i + 1] - 32);
				}
			}
		}

		return new String(arr);
	}

	//Using Library Methods : 
	
	/*String firstLetterCapitalize(String str) {
		
		char key = ' ';
		if(str == null || str.isEmpty()) {

			return str;
		}

		str = str.substring(0,1).toUpperCase() + str.substring(1);
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == key) {
				
				str = str.substring(0,i + 1) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2);
			}
		}

		return str;
	}*/
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter the String : ");
		String str = br.readLine();

		str = obj.firstLetterCapitalize(str);
		System.out.println("Output : " + str);
	}
}
