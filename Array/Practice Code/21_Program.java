/*
 Program 21 : Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
	      Note: If at any instance, there are no more subarrays of size greater than or equal to K, then 
	      reverse the last subarray (irrespective of its size). You shouldn't return any array, modify 
	      the given array in-place.

	      Input:
		N = 5, K = 3
		arr[] = {1,2,3,4,5}
	      Output: 3 2 1 5 4
	      Explanation: First group consists of elements
              1, 2, 3. Second group consists of 4,5.
 */

import java.io.*;

class Array_Rev{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];

		System.out.println("Enter the Elements in array : ");
		for(int i = 0; i < size;i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the sub-array group of size : ");
		int k = Integer.parseInt(br.readLine());
		
		if(k <= size){
			int end = k - 1;
			for(int i = 0 ;i < k /2; i++){
			
				int temp = arr[i];
				arr[i] = arr[end];
				arr[end] = temp;

				end--;

			}
		}else{
			
			System.out.println("Invalid Input");
		}

		System.out.println("After array reverse : ");
		for(int i = 0; i < size;i++){
			
			System.out.println(arr[i]);
		}
	}
}
