/*
 Program 1 : Write a program to print count of digits in elements of array.
		Input: Enter array elements : 02 255 2 1554
		Output: 2 3 1 4
 */

import java.io.*;

class countDigit{
	
	static void digitCount(int arr[]){

		System.out.println("Count of Digit in elements of Array : ");
		for(int i = 0 ;i < arr.length; i++){
			
			int count= 0;
			int num = arr[i];
			while(num != 0){
				count++;
				num /= 10;
			}
			System.out.println(count);
		}
	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < arr.length; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		digitCount(arr);
	}
}
