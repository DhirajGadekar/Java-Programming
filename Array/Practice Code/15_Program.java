/*
 Program 15 : Write a Java program to copy an array by iterating the array. 
 */

import java.io.*;

class Array{
        
        public static void main(String[] args)throws IOException{
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int[] arr1 = new int[size];
		int[] arr2 = new int[size];

                System.out.println("Enter the element of array : ");
                for(int i = 0; i < size;i++){
                
                        arr1[i] = Integer.parseInt(br.readLine());
			arr2[i] = arr1[i];
                }
		System.out.println("Copied Array : ");
		for(int i = 0; i < size;i++){
			
			System.out.println(arr2[i]);
		}
        }
}
