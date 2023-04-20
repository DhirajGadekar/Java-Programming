/*
 Program 1 : Write a program to create an array of ‘n’ integer elements.
	     Where ‘n’ value should be taken from the user.
	     Insert the values from users and find the sum of all elements in the array.
		Input:
			n=6
			Enter elements in the array: 2 3 6 9 5 1
		Output:
			26
 */

import java.io.*;

class ArrayAssignment{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of Array : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int sum = 0;
		System.out.println("Enter the array Elements : ");
		for(int i = 0;i < arr.length;i++){
			
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}

		System.out.println("Sum of all Array Elements : " + sum);
	}
}
