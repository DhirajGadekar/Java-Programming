/*
 Program 6 : Write a program that creates integer array of 
 	     10 elements, accepts values of arrays and Find Average.
 */

import java.io.*;

class Array{
        
        public static void main(String[] args)throws IOException{
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int[] arr = new int[size];
		double avg = 0;
		int sum = 0;

                System.out.println("Enter the element of array : ");
                for(int i = 0; i < size;i++){
                
                        arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];

                }
		avg = (double) sum/size;
		System.out.println("Average : " + avg);
        }
}
