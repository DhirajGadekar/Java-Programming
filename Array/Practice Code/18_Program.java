/*
 Program 18 : Write a Java program to find the duplicate values of 
 	      an array of integer values. 
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
		
		int dup = 0;
		for(int i = 0;i < size;i++){
			
			for(int j = 1; j < size;j++){
				
				if(arr[i] == arr[j] && j != i){
					
					dup = arr[i];
				}
			}	
			
		}
		System.out.println("Duplicate Element : " + dup);
        }
}
