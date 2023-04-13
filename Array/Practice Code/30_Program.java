/*
 Problem 30 : #LeetCode - Easy
 	      Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 	      If not, return the index where it would be if it were inserted in order.

	      You must write an algorithm with O(log n) runtime complexity.

	      Example 1:
			Input: nums = [1,3,5,6], target = 5
			Output: 2
		
	      Example 2:
			Input: nums = [1,3,5,6], target = 2
			Output: 1
		
	      Example 3:
			Input: nums = [1,3,5,6], target = 7
			Output: 4
	      
	      Constraints:
			1 <= nums.length <= 104
			-104 <= nums[i] <= 104
			nums contains distinct values sorted in ascending order.
			-104 <= target <= 104
 */

import java.io.*;

class SearchPosition{
	
	static int SearchPosition(int arr[],int target){
		
		if(arr[arr.length - 1] < target){
			
			return arr.length;
		}
		for(int i = 0 ; i < arr.length - 1; i++){
			
			if(arr[i] <= target && arr[i + 1] >= target){
				
				return i + 1;
			}
		}
		return 0;
		
	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];

		System.out.println("Enter elements in array : ");
		for(int i = 0 ; i < size; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the target element : ");
		int target = Integer.parseInt(br.readLine());

		int  ret = SearchPosition(arr,target);
		System.out.println("Insert Position is : " + ret);
	}
}
