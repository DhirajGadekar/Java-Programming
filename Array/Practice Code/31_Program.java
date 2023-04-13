/*
 Program 31 : #LeetCode - Easy
 	      You are given a large integer represented as an integer array digits, 
 	      where each digits[i] is the ith digit of the integer. The digits are ordered 
	      from most significant to least significant in left-to-right order. The large 
	      integer does not contain any leading 0's.

	      Increment the large integer by one and return the resulting array of digits.
	      Example 1:
			Input: digits = [1,2,3]
			Output: [1,2,4]
			Explanation: The array represents the integer 123.
				     Incrementing by one gives 123 + 1 = 124.
	                             Thus, the result should be [1,2,4].
	      Example 2:
			Input: digits = [4,3,2,1]
			Output: [4,3,2,2]
			Explanation: The array represents the integer 4321.
				     Incrementing by one gives 4321 + 1 = 4322.
				     Thus, the result should be [4,3,2,2].
	      
	      Example 3:
			Input: digits = [9]
			Output: [1,0]
			Explanation: The array represents the integer 9.
				     Incrementing by one gives 9 + 1 = 10.
				     Thus, the result should be [1,0].
 
	      Constraints:
			1 <= digits.length <= 100
			0 <= digits[i] <= 9
			digits does not contain any leading 0's.
 */

import java.io.*;

class PlusOne{
	
	static int plusOne(int arr[],int num){
		
		int count = 0;
		int temp = num;
		while(temp != 0){
			
			count++;
			temp /= 10; 
		}
		int i = count - 1;
		while(num != 0){
			int rem = num % 10;
			arr[i] = rem;
			i--;
			num /= 10;
		}
		return count;
	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size + 1];
		int num = 0;
		System.out.println("Enter the elements in array : ");
		for(int i = 0 ; i < size; i++ ){
			
			arr[i] = Integer.parseInt(br.readLine());
			num = (num * 10) + arr[i];
		}
		
		int ret = plusOne(arr,num + 1);

		System.out.print("After plus one Array : \n[");
		for(int i = 0 ; i < ret - 1;i++){
			System.out.print(arr[i] + ",");
		}
		System.out.print(arr[ret - 1] + "]\n");
				
	}
}
