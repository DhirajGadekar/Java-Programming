/*
 Program 1 : Write a program to create a 2x2 2d array of integer elements.
	     And print all elements from a 2d array (take hardcoded values in array)
	
	Output :
		1 2
		3 4
 */

class Solution {

	void print2DArray(int arr[][]) {
		
		for(int i[] : arr) {
			
			for(int j : i) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
class TwoDArrayAssignment {
	
	public static void main(String[] args) {
		
		Solution obj = new Solution();

		int arr[][] = new int[2][2];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;

		obj.print2DArray(arr);
	}
}
