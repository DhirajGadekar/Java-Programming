/*
 Program 10 : Write a program that creates integer array of 10 elements, 
 	      accepts values of arrays and Search for a number in an array of 10.
 */

import java.io.*;

class Array{
        
        public static void main(String[] args)throws IOException{
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Searching Number : ");
		int Num = Integer.parseInt(br.readLine());

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());
		
		int flag = 0;

                int[] arr = new int[size];

                System.out.println("Enter the element of array : ");
                for(int i = 0; i < size;i++){
                
                        arr[i] = Integer.parseInt(br.readLine());
                }
                
		for(int i = 0; i < size;i++){
                
                        if(arr[i] == Num){
				
				flag = 1;
				break;
			}
                }
		if(flag == 1){
			
			System.out.println(Num + " is Found in Array");
		}else{

			System.out.println(Num + " is Not Found in Array");
		}
        }
}
