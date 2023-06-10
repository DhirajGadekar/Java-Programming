/*
 Program 10 : Write a java program to check if the given strings are anagram or not
	
	Input :
		First String : shashi
		Second String : ashish
		
	output :
		Both strings are anagram strings.
 */

import java.io.*;
import java.util.*;

class Solution {
	
	//without Using Library Methods :	
	int isLength(char arr[]) {

		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			count++;
		}
		return count;
	}
	void sortString(char arr[]) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int j = 0; j < arr.length - 1 - i; j++) {
				
				if(arr[j] > arr[j + 1]) {
					
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
	}
	
	boolean anagramString(String str1, String str2) {
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		if(isLength(arr1) == isLength(arr2)) {

			sortString(arr1);	
			sortString(arr2);
			
			boolean flag = false;
			for(int i = 0; i < arr1.length; i++) {
				
				if(arr1[i] == arr2[i]) {
					
					flag = true;
				} else {
					
					flag = false;
					break;
				}
			}
			return flag;
		} else {
			
			return false;
		}	
	}

	//Using Library Methods :
	/*boolean anagramString(String str1, String str2) {

		if(str1.length() == str2.length()) {
			
			char arr1[] = str1.toCharArray();
			char arr2[] = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			str1 = new String(arr1);
			str2 = new String(arr2);

			if(str1.equals(str2)) {

				return true;
			} else {
				
				return false;
			}

		} else {
			
			return false;
		}
	}*/
}
class StringAssignment {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Solution obj = new Solution();

		System.out.println("Enter the First String : ");
		String str1 = br.readLine();

		System.out.println("Enter the Second String : ");
		String str2 = br.readLine();

		boolean ret = obj.anagramString(str1,str2);
		if(ret) {
			
			System.out.println("String is Anagram");
		} else {
			
			System.out.println("String is Not Anagram");
		}
	}
}
