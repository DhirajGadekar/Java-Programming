/*
 Program 8 : WAP to find the uncommon elements between two arrays.
		Input :
			Enter first array : 1 2 3 5
			Enter Second array: 2 1 9 8
		Output: 
			Uncommon elements : 3 5 9 8
 */

import java.io.*;

class ArrayAssignment{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of Array : ");
                int size = Integer.parseInt(br.readLine());

                int arr1[] = new int[size];
                int arr2[] = new int[size];

                System.out.println("Enter in 1st array Elements : ");
                for(int i = 0;i < arr1.length;i++){

                        arr1[i] = Integer.parseInt(br.readLine());
                }
		
		System.out.println("Enter in 2nd array Elements : ");
                for(int i = 0;i < arr2.length;i++){

                        arr2[i] = Integer.parseInt(br.readLine());
                }

		
                System.out.println("UnCommon Elements : ");
                for(int i = 0; i < arr1.length; i++){
			int flag = 0;
                        for(int j = 0; j < arr2.length; j++){
				
				if(arr1[i] == arr2[j]){
				     flag = 1;     
				}		     
                        }
			if(flag == 0){
				System.out.println(arr1[i]);
			}
                }
                for(int i = 0; i < arr1.length; i++){
			int flag = 0;
                        for(int j = 0; j < arr2.length; j++){
				
				if(arr2[i] == arr1[j]){
				     flag = 1;     
				}		     
                        }
			if(flag == 0){
				System.out.println(arr2[i]);
			}
		}

        }
}

