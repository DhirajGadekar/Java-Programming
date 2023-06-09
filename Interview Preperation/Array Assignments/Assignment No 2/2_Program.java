/*
 Program 2 : WAP to find the common elements between two arrays.
	Input :
	Enter first array :
	1
	2
	3
	5
	Enter Second array
	2
	1
	9
	8
	Output:
	1
	2
 */

import java.io.*;

class Solution {
	
	void commonElements(int arr1[], int arr2[]) {
		
		for(int i = 0; i < arr1.length; i++) {

			for(int j = 0; j < arr1.length; j++) {
				
				if(arr1[i] == arr2[j]) {
					
					System.out.println(arr1[i]);
				}
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

		int arr1[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("Enter the elements in 1st Array : ");
		for(int i = 0; i < arr1.length; i++) {
			
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the elements in 2nd Array : ");
		for(int i = 0; i < arr2.length; i++) {
			
			arr2[i] = Integer.parseInt(br.readLine());
		}
		obj.commonElements(arr1,arr2);
        }
}
