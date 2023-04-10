/*
 Program 11 : Write a program which takes in 10 values and 
 	      creates another array which has cubes of the values and prints it.
 */

import java.io.*;

class Array{
        
        public static void main(String[] args)throws IOException{
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());
			
                int[] arr = new int[size];
		int[] cube = new int[size];

                System.out.println("Enter the element of array : ");
                for(int i = 0; i < size;i++){
                
                        arr[i] = Integer.parseInt(br.readLine());
			cube[i] = arr[i]*arr[i]*arr[i];
                }

		System.out.println("Cube Array : ");
		for(int i = 0; i < size;i++){
			
			System.out.println(cube[i]);
		}

        }
}
