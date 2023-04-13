/*
 Problem 26 : #LeetCode - Easy
 	      Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
	      answer.length == nums.length.
	      answer[i] = |leftSum[i] - rightSum[i]|.
	      Where:
	      leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
	      rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
	      Return the array answer.

	      Example 1:
	      		Input: 
				nums = [10,4,8,3]
	      		Output: [15,1,11,22]
	      		Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
			   	     The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
	
	      Example 2:
			Input: 
				nums = [1]
			Output: [0]
			Explanation: The array leftSum is [0] and the array rightSum is [0].
				     The array answer is [|0 - 0|] = [0].
 
	      Constraints:
			1 <= nums.length <= 1000
			1 <= nums[i] <= 105
 */

import java.io.*;

class leftRightDiff{
	
	void Left_Right_Diff(int arr[],int arr1[]){
		
		int sum1 = 0,sum2 = 0;
		int size = arr.length;

		int[] arrLeft = new int[size];
		int[] arrRight = new int[size];

		arrLeft[0] = sum1;
		arrRight[0] = sum2;
		
		int point = arr.length;
		for(int i = 1; i < arr.length;i++){
			
			sum1 = sum1 + arr[i - 1];
			arrLeft[i] = sum1;

			sum2 = sum2 + arr[point - i];
			arrRight[i] = sum2;
		}
		
	       for(int i = 0 ; i < arr.length;i++){
		
		       int num = arrLeft[i] - arrRight[arr.length - i - 1];
		       if(num < 0){
				
			       int mult = num * (-2);
			       num = mult + num;
			       arr1[i] = num;
		       }else{
				arr1[i] = num;
		       }
	       }	       
	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		leftRightDiff obj = new leftRightDiff();

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];

		System.out.println("Enter the Array elements : ");
		for(int i = 0 ; i < size; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] arr1 = new int[size];
		obj.Left_Right_Diff(arr,arr1);

		System.out.println("Left and Right array Difference array : ");
		for(int i = 0 ;i < arr.length; i++){
			
			System.out.print(" " + arr1[i]);
		}
	}
}
