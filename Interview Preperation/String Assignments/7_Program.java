/*
 Program 7 : Write a program to count the frequency of each letter in the String.

	Input :
		core2web technologies

	Output :
		c : 2
		o : 3
		r : 1
		e : 4
		2 : 1
		w : 1
		b : 1
		t : 1
		h : 1
		n : 1
		l : 1
		g : 1
		i : 1
		s : 1
 */

import java.io.*;

class Solution {
	
	boolean isPresent(char key, char arr[],int itr) {
		
		for(int i = 0; i < itr; i++) {
			
			if(key == arr[i]) {
				
				return true;
			}
		}
		return false;
	}
	void frequencyCount(String str) {
		
		char arr[] = new char[str.length()];
		int itr = 0;
		for(int i = 0; i < str.length(); i++) {
			
			int count = 0;
			for(int j = 0 ;  j < str.length(); j++) {
			
				if(str.charAt(i) == str.charAt(j)) {
				
					count++;
				}	
			}
			if(isPresent(str.charAt(i),arr,itr)) {
				
				continue;
			} else {
				
				if(' ' != str.charAt(i)) {
					System.out.println(str.charAt(i) + " : " + count);
				}
				arr[itr] = str.charAt(i);
				itr++;
			}
		}
	}
}
class StringAssignment {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Solution obj = new Solution();

		System.out.println("Enter String : ");
		String str = br.readLine();

		obj.frequencyCount(str);
	}
}
