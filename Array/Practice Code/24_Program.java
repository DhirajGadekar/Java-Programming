/*
 Program 24 : Write a Java program to find the number of even and odd integers in a given array of integers.
 */

import java.io.*;

class Array_integer{

	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];
		int[] even = new int[size];
		int[] odd = new int[size];

		System.out.println("Enter the array elements : ");
		for(int i = 0; i < size; i++){
			
			arr[i] = Interger.parseInt(br.readLine());
		}

		for(int i = 0; i < size; i++){
			
			if(arr[i] % 2 == 0){
				even[i] = arr[i];		
			}
		}
		

				even[i] = arr[i];		
			}
		}
	}
}
