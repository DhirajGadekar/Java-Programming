/*
 *Program 6 : WAP to remove a specific element from an array.
	Input:
		1
		2
		4
		5
		6
	Enter element to remove : 4
	Output:
		1
		2
		5
		6
 */

import java.io.*;

class Solution {
	
	void removeElement(int arr[] , int k) {
		
		int nums[] = new int[arr.length];
		int itr = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == k) {
				
				continue;
			} else {
				
				nums[itr] = arr[i];
				itr++;
			}
		}
			
		System.out.println("After Removing : ");
		for(int i = 0; i < itr; i++) {
			
			System.out.println(nums[i]);
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

		System.out.println("Enter the array Elements : ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter element to remove : ");
                int k = Integer.parseInt(br.readLine());

		obj.removeElement(arr,k);
        }
}
