/*
 Problem 28 : #LeetCode - Easy
 	      Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place 
 	      such that each unique element appears only once. The relative order of the elements should 
	      be kept the same. Then return the number of unique elements in nums.

	      Consider the number of unique elements of nums be k, to get accepted, you need to do the following things:

	      -Change the array nums such that the first k elements of nums contain the unique elements in 
	       the order they were present in nums initially. The remaining elements of nums are not important 
	       as well as the size of nums.
	      -Return k.

	      Custom Judge:
		The judge will test your solution with the following code:

		int[] nums = [...]; // Input array
		int[] expectedNums = [...]; // The expected answer with correct length

		int k = removeDuplicates(nums); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
    			assert nums[i] == expectedNums[i];
		}
		If all assertions pass, then your solution will be accepted.

		Example 1:
			Input: nums = [1,1,2]
			Output: 2, 
				nums = [1,2,_]
			Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
				     It does not matter what you leave beyond the returned k (hence they are underscores).
		
				     
	        Example 2:
			Input: nums = [0,0,1,1,1,2,2,3,3,4]
			Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
			Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
				     It does not matter what you leave beyond the returned k (hence they are underscores).
 

	        Constraints:
			1 <= nums.length <= 3 * 104
			-100 <= nums[i] <= 100
			nums is sorted in non-decreasing order.
 */

import java.io.*;

class RemoveDup{
	
	static int Remove_Duplicate(int arr[],int arr1[]){
		
		if(arr.length == 1){
			
			arr1[0] = arr[0];
			return 1;
		}
		if(arr.length <= 2){
			
			if(arr[0] != arr[1]){
				arr1[0] = arr[0];
				arr1[1] = arr[1];
				return 2;
			}else{		
				arr1[0] = arr[0];
				return 1;
			}
			
		}
		int point = 0;
		int i = 0;
		while(i < arr.length - 1){

			int j = i;
			while(arr[i] == arr[j]){
				
				arr1[point] = arr[i];
				j++;
			}
			point++;
			i = j;
		}
		if(arr[arr.length - 2] != arr[arr.length - 1]){

			arr1[point] = arr[arr.length - 1];
		}
		return point;
	}	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];

		System.out.println("Enter the array elements with sorted : ");
		for(int i = 0 ; i < size; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] arr1 = new int[size];
		int ret = Remove_Duplicate(arr,arr1);

		System.out.print("After duplicate elemnts remove array : \n[");
		for(int i = 0 ; i < size; i++){
		
			System.out.print(arr1[i] + ",");
			
		}
		System.out.print("]\n");
		
		
	}
}
