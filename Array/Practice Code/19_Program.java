/*
 Program 19 : Write a Java program to find the common elements between two arrays of integers.
 */

import java.io.*;

class Array{
        
        public static void main(String[] args)throws IOException{
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int[] arr1 = new int[size];
		int[] arr2 = new int[size];

                System.out.println("Enter the elements in 1st array : ");
                for(int i = 0; i < size;i++){
                
                        arr1[i] = Integer.parseInt(br.readLine());
                }
                System.out.println("Enter the elements in 2nd array : ");
                for(int i = 0; i < size;i++){
                
                        arr2[i] = Integer.parseInt(br.readLine());
                }
                
		System.out.println("Common elements in Both Array : ");
                for(int i = 0; i < size;i++){

			for(int j = 0; j < size;j++){
				
				if(arr1[i] == arr2[j]){
					
					System.out.println(arr1[i]);
				}

			}
                }
             
        }
}
