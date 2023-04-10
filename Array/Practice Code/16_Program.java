/*
 Program 16 : Write a Java program to insert an element (specific position) into an array.
 */

import java.io.*;

class Array{
        
        public static void main(String[] args)throws IOException{
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the Position of array : ");
                int Pos = Integer.parseInt(br.readLine());

                System.out.println("Enter the Element : ");
                int Ele = Integer.parseInt(br.readLine());

		int arr[] = {1,2,3,4,5,6,7};

		int temp = 0;
                for(int i = arr.length - 1; i > Pos;i--){
                	
			arr[i] = arr[i - 1];
                }
		
		arr[Pos] = Ele;
		for(int i = 0; i < arr.length;i++){
			
			System.out.println(arr[i]);
		}
        }
}
