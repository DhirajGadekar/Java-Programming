/*
 Program 4 : WAP to take 1-D array from user and print the largest
   	     element of the array.
 */

import java.io.*;

class Array{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];

		System.out.println("Enter the element of array : ");
		
		int max = arr[0];
		
		for(int i = 0; i < size;i++){
	
			arr[i] = Integer.parseInt(br.readLine());
		}
	
		for(int i = 1; i < size;i++){
			
			if(max < arr[i]){
				
				max = arr[i];
			}

		}
		System.out.println("Maximum In Array : " + max);
	}
}
