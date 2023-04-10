//Program 2 : Sum of array elemnts 

import java.io.*;

class ArraySum{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());
		int sum = 0;

		int[] arr = new int[size];

		System.out.println("Enter the element in Array : ");
		for(int i = 0; i < size;i++){
			
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}
		System.out.println("Sum of the array elements : " + sum);
	}

}
