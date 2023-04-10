/*
 Program 7 : WAP to take 1-D array from user and print the Second Largest
             element of the array.
 */

import java.io.*;

class Array{
        
        public static void main(String[] args)throws IOException{
        
		int temp = 0; 
                int arr[] = {1,4,2,5,3,9,0}; 

                System.out.println("Enter the element of array : ");
                
		for(int i = 0; i < 7;i++){
                
                         for(int j = 0;j < 7;j++){
				
				 if(arr[i] < arr[j]){
					
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
			
                }
		
		System.out.println(arr[7-2]);
        }
}
