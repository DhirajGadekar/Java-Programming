/*
 Program 8 : WAP to Take input from the user and find an Armstrong number in the array.
	     Input:
		1
		5
		22
		65
		153
		371
	     Output:
		1
		5
		153
 */

import java.io.*;

class Solution {
	
	boolean isArmStrong(int num) {
		
		int temp = num;
		int count = 0;
		while(temp != 0) {
			
			count++;
			temp /= 10;
		}
		temp = num;
		int sum = 0;
		while(temp != 0) {
			
			int rem = temp % 10;
			int mul = 1;
			
			for(int i = 1; i <= count; i++) {
				
				mul = mul * rem;
			}
			sum = sum + mul;
			temp /= 10;
		}
		if(num == sum) {

			return true;
		} else {
			
			return false;
		}
	}
	void armStrongNumberArray(int arr[]) {
		
		System.out.println("ArmStrong Numbers in Array : ");

		for(int i = 0; i < arr.length; i++) {
			
			if(isArmStrong(arr[i])) {
				
				System.out.println(arr[i]);
			}
		}
	}
}
class ArrayAssignment {
	
	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Solution obj = new Solution();

		System.out.println("Enter the length of an Array : ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		System.out.println("Enter the elements of Array : ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		obj.armStrongNumberArray(arr);
	}
}
