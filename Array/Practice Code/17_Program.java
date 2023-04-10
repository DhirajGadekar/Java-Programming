/*
 Program 17 : Write a Java program to reverse an array of integer values. 
 */

import java.io.*;

class Array{
        
        public static void main(String[] args)throws IOException{
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int[] arr = new int[size];

                System.out.println("Enter the element of array : ");
                for(int i = 0; i < size;i++){
                
                        arr[i] = Integer.parseInt(br.readLine());
                }
		int end = size - 1;
		int temp = 0;
		for(int i = 0; i < size /2; i++){
			
			temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
			end--;
		}

		System.out.println("Reverce array : ");
		for(int i = 0; i < size;i++){
			
			System.out.println(arr[i]);
		}
        }
}
