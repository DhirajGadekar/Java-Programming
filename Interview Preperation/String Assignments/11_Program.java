/*
 Program 11 : Write a Program to sort String on their length in Java. You should
	      accept an array of String and return a sorted array based upon the 
	      length of String.

	Input :
		Shashi Ashish Kanha Rahul Badhe

	Output :
		Badhe Kanha Rahul Ashish Shashi
 */

import java.io.*;

class Solution {
	
	void sortStringArray(String arr[]) {
		
		for(int i = 0 ; i < arr.length - 1; i++) {

			for(int j = 0; j < arr.length - 1 - i; j++) {
				
				if(arr[j].length() > arr[j + 1].length()) {

					String temp = arr[j];
					arr[j] = arr[j + 1];
				        arr[j + 1] = temp;	
				} else if(arr[j].length() == arr[j + 1].length()){
					
					if(arr[j].charAt(0) > arr[j + 1].charAt(0)) {

						String temp = arr[j];
						arr[j] = arr[j + 1];
				        	arr[j + 1] = temp;	
					}
				}
			}
		}
	}
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter the String Array length : ");
		int n = Integer.parseInt(br.readLine());

		String arr[] = new String[n];

		System.out.println("Enter the String Array Elements : ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = br.readLine(); 
		}

		obj.sortStringArray(arr);
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
