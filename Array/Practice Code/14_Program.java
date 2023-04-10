/*
 Program 14 : Write a Java program to remove a specific element from an array.
 	      note : Every element is Unique in array

	      input = {1,2,3,4,5}
	      Element = 3
	      Oupput = {1,2,4,5,0}
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
		int index = 0;
		int Ele = 5;
		for(int i = 0 ; i < size;i++){
			
			if(Ele == arr[i]){
				
				index = i;
			}
		}
		
		for(int i = index;i < size - 1 ;i++){
			
			arr[i] = arr[i + 1];
		}
		arr[size - 1] = 0;
		for(int i = 0;i < size;i++){
			
			System.out.println(arr[i]);
		}
        }
}
