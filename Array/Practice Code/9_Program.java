/*
 Program 9 : Write a program that creates integer array of 10 elements, 
 	     accepts values of arrays and Find sum of all odd numbers
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
		int Sum = 0;
                for(int i = 0; i < size;i++){
                
                        if(arr[i] % 2 == 1){
				
				Sum += arr[i]; 
			}
                }
		System.out.println("Sum of All odd numbers : " + Sum);
        }
}
