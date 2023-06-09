/*
 *Program 5 : Write a Java program to merge two given arrays.
	Input :
 		Array1 = [10, 20, 30, 40, 50]
		Array2 = [9, 18, 27, 36, 45]
	Output :
		Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
 */

import java.io.*;

class Solution {
	
	void mergeArray(int arr1[], int arr2[]) {
		
		int arr[] = new int[arr1.length + arr2.length];

		for(int i = 0; i < arr.length; i++) {
			
			if(i < arr1.length) {

				arr[i] = arr1[i];
			} else {

				arr[i] = arr2[i - arr1.length];
			}
		}
		System.out.println("Merge Array : ");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
class ArrayAssignment {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Solution obj = new Solution();

		System.out.println("Enter the length 1st and 2nd Array : ");
                int n1 = Integer.parseInt(br.readLine());
                int n2 = Integer.parseInt(br.readLine());
		
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		System.out.println("Enter the elements in 1st Array : ");
		for(int i = 0 ; i < arr1.length; i++) {	
			
			arr1[i] = Integer.parseInt(br.readLine()); 
		}
		
		System.out.println("Enter the elements in 2nd Array : ");
		for(int i = 0 ; i < arr2.length; i++) {	
			
			arr2[i] = Integer.parseInt(br.readLine()); 
		}

		obj.mergeArray(arr1,arr2);
        }
}
