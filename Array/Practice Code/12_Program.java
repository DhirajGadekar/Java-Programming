/*
 Program 12 : Write a program to take in 10 values and 
 	      print only those numbers which are palindrome.
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
		for(int i = 0; i < size;i++){
			int num = arr[i];
			int sum = 0;
			while(num != 0){
				int rem = num % 10;
				sum = (sum * 10) + rem;
				num /= 10;
			}
			if(sum == arr[i]){
				
				System.out.println(arr[i]);
			}

		}
        }
}
