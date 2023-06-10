/*
 Program 3 : Write a program to reverse only the words of a string
	
	Input String :
		Core2Web Tech

	Output String : 
		beW2eroC hceT
 */

import java.io.*;
import java.util.*;

class Solution {
	
	//Without use of any Predefine class or Method :
	String wordReverse(String str) {
		
		char arr[] = str.toCharArray();
		
		char key = ' ';
		
		int start = 0;
		int end = arr.length - 1;

		for(int i = 0; i < arr.length; i++) {
			
			if(key == arr[i]) {
				
				end = i - 1;
				while(start < end) {
		
					char temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;

					start++;
					end--;
				}	
				start = i + 1;	
			}
		}
		end = arr.length - 1;	
		while(start < end) {
			
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;

			start++;
			end--;
		}

		return new String(arr);
	}

	//Using Predefin Methods :
	/*String wordReverse(String str) {
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int count = st.countTokens();
		String arr[] = new String[count];

		int j = 0;
		while(st.hasMoreTokens()) {
			
			arr[j] = st.nextToken();
			j++;
		}

		for(int i = 0; i < arr.length; i++) {

			StringBuffer sb = new StringBuffer(arr[i]);
			sb.reverse();
			
			arr[i] = new String(sb);
		}

		return String.join(" ",arr);
	}*/
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter the String : ");
                String str = br.readLine();

                str = obj.wordReverse(str);
                System.out.println("Reverse String : " + str);

	}
}
