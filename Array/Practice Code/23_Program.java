/*
 Program 23 : Given an array of size N-1 such that it only contains distinct integers 
 	      in the range of 1 to N. Find the missing element.

	      Input:
		N = 5
		A[] = {1,2,3,5}
	      Output: 4

	      Input:
		N = 10
		A[] = {6,1,2,8,3,4,7,10,5}
	      Output: 9
 */

import java.io.*;

class array_miss{

	public static void main(String[] args)throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];
		
		System.out.println("Enter the array Elements : ");
		for(int i = 0; i < size;i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < size - 1; i++){
			
			for(int j = 0; j < size - 1 - i; j++){
				
				if(arr[j] > arr[j + 1]){
					
					int temp = arr[j];
					arr[j] = arr[ j + 1];
					arr[ j + 1] = temp;
				}
			}
		}

		int flag = 0;
		int diff = arr[1] - arr[0];
		for(int i = 0; i < size - 1; i++){
			
			if(arr[i + 1] - arr[i] != diff ){
				flag = 1;
				System.out.println("distinct integers in the range of 1 to " + size + " is " + (arr[i] + diff));
				break;
			}
			
		}
		if(flag == 0){
			
			System.out.println("Not Missing element in array");
		}

	}
}
