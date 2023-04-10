
 /*
   Program 3 : WAP to compare two arrays by with length and elements given by
   	       user if array are equal then print “Equal” otherwise print “Not
     	       Equal.
 */
 

import java.io.*;

class Array{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size of Array : ");
		int size = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		int flag = 0;
		System.out.println("Enter the Element in 1st array : ");
		for(int i = 0; i < size; i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the Element in 2nd array : ");
		for(int i = 0; i < size; i++){
		
			arr2[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 1; i < size; i++){
			
			if(arr1[i] == arr2[i]){
				
				flag = 1;
			}else{
				
				flag = 0;
				break;
			}
		}
		if(flag == 1){
			
			System.out.println("Array are Equal.");
		}else{

			System.out.println("Array are Not Equal.");
		}
	}
}
