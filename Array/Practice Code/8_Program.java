/*
 Program 8 : Write a program that creates integer array of 10 elements, 
 	     accepts values of arrays and Print only even numbers in the array.
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
               	
		System.out.println("Even Numbers in Array : ");
		for(int i = 0; i < size ;i++){
                
                        if((arr[i]) % 2 == 0){
				
				System.out.print(arr[i] + " ");
			}
                }
        }
}
