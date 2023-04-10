/*
 Program 5 : WAP to take 1-D array from user and print the smallest
             element of the array.

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
                
		int min = arr[0];
		for(int i = 1; i < size;i++){
                
                        if(min > arr[i]){
				
				min = arr[i];
			}
                }

		System.out.println("Smallest Element in Array : " + min);
        }
}
