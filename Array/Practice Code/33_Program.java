/*
 Program 33 : #LeetCode - Easy
 	      Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

	      You must implement a solution with a linear runtime complexity and use only constant extra space.

	      Example 1:
			Input: nums = [2,2,1]
			Output: 1
		
	      Example 2:
			Input: nums = [4,1,2,1,2]
			Output: 4
		
	      Example 3:
			Input: nums = [1]
			Output: 1
 
	      Constraints:
			1 <= nums.length <= 3 * 104
			-3 * 104 <= nums[i] <= 3 * 104
			Each element in the array appears twice except for one element which appears only once.
 */

import java.io.*;

class singleNumber{
	
	static int singleNumber(int arr[]){
		
		for(int i = 1 ; i < arr.length; i++){
			int val = arr[i];
			int j = i - 1;
			while(arr[j] > val &&  j >= 0){
				
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}

	
		if(arr[0] != arr[1]){
			return arr[0];
		}
		for(int i = 1; i < arr.length - 1 ; i++){

			if(arr[i] != arr[i + 1] && arr[i] != arr[ i - 1]){
				
				return arr[i];
			}
		}
		if(arr[arr.length - 2] != arr[arr.length - 1]){
			return arr[arr.length - 1];
		}
		return 0;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];

		System.out.println("Enter the array Elements : ");
		for(int i = 0 ; i < size; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		int single = singleNumber(arr);
		System.out.println("Single Element : " + single);
	}
}
