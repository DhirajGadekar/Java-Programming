/*
 Program 1 : Write a Program to search for a given String in an array of Strings.

 	Input Strings:
		Shashi,Ashish,Kanha,Rahul,Badhe

	String to Search:
			Kanha

	Output:
		String found at index : 2
 */

import java.io.*;

class Solution {
	
	//Without Use of predefine Methods of String : 
	
	int myStrLength(String str) {
		
		char arr[] = str.toCharArray();
		int count = 0;
		for(int i =0;i < arr.length; i++) {

			count++;
		}
		return count;
	}
	boolean isEqual(String str, String target) {
		
		char arr1[] = str.toCharArray();
		char arr2[] = target.toCharArray();

		boolean flag = false;

		if(myStrLength(str) == myStrLength(target)) {
			
			for(int i = 0; i < arr1.length; i++) {
				
				if(arr1[i] == arr2[i]) {
					
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
		} else {
			
			return false;
		}
	}
	int searchString(String arr[] ,String target) {

		for(int i = 0; i < arr.length; i++) {
						
			if(isEqual(arr[i],target)) {
				
				return i;
			}
		}
		return -1;
	}

	/*
	 Using predefine methods of String :

	 int searchString(String arr[], int target) {

	 	for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(target)) {
				
				return i;
			}
		}
		return -1;
	 }
	 */
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter the length of Array : ");
		int n = Integer.parseInt(br.readLine());

		String arr[] = new String[n];

		System.out.println("Enter the array Element : ");
		for(int  i = 0; i < arr.length; i++) {
			
			arr[i] = br.readLine();
		}
		
		System.out.println("Enter the Searching String : ");
		String target = br.readLine();

		int index = obj.searchString(arr,target);
		System.out.println("String found at index : " + index);
	}
}
