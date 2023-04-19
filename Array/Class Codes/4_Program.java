//Take Array Elements from User : 

import java.io.*;

class ArrayDemo{
	
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter the array Elements : ");
		for(int i = 0 ; i < arr.length; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array Elements : ");
		for(int i = 0 ; i < arr.length; i++){
			
			System.out.println(arr[i]);
		}
		
	}
}
