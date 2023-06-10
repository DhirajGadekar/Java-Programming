/*
 Program 4 : Write a Program in Java to Concatenate number of strings without
	     using library function
	
	Input :
		Enter Number of String to Concat : 3
		Enter Strings :
			Shashi
			Core2Web
			Biencaps
	Output :
		ShashiCore2WebBiencaps
 */

import java.io.*;

class Solution {
	//Without using library Methods :	
	String concatString(String str1, String str2, String str3) {
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		char arr3[] = str3.toCharArray();

		char str[] = new char[arr1.length + arr2.length + arr3.length];

		int itr1 = 0, itr2 = 0, itr3 = 0;
		for(int i = 0; i < str.length; i++) {
			
			if(itr1 < arr1.length) {
				
				str[i] = arr1[itr1];
				itr1++;
			} else if(itr2 < arr2.length) {
				
				str[i] = arr2[itr2];
				itr2++;
			} else {
				
				str[i] = arr3[itr3];
				itr3++;
			}
		}
		 return new String(str);
	}

	//Using Library Methods : 
	
	/*String concatString(String str1, String str2, String str3) {
		
		str2 = str1.concat(str2);
		str3 = str2.concat(str3);

		return str3;
	}*/
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter the 1st String : ");
		String str1 = br.readLine();
		
		System.out.println("Enter the 2nd String : ");
		String str2 = br.readLine();
		
		System.out.println("Enter the 3rd String : ");
		String str3 = br.readLine();

		String ccString = obj.concatString(str1,str2,str3);
		System.out.println(ccString);
	}
}
