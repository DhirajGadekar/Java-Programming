/*
 Program 9 : Write a Java program to merge two given arrays.
		Array1 = [10, 20, 30, 40, 50]
		Array2 = [9, 18, 27, 36, 45]
		Output :
			Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
 */

import java.io.*;

class ArrayAssignment{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of Array : ");
                int size = Integer.parseInt(br.readLine());

                int arr1[] = new int[size];
                int arr2[] = new int[size];
                int arr3[] = new int[arr1.length + arr2.length];
		
		int itr = 0;
                System.out.println("Enter in 1st array Elements : ");
                for(int i = 0;i < arr1.length;i++){

                        arr1[i] = Integer.parseInt(br.readLine());
			arr3[itr] = arr1[i];
			itr++;
                }
                
		System.out.println("Enter in 2nd array Elements : ");
                for(int i = 0;i < arr2.length;i++){

                        arr2[i] = Integer.parseInt(br.readLine());
			arr3[itr] = arr2[i];
			itr++;
                }

		System.out.println("Merged Array : ");
		for(int i = 0 ; i < arr3.length;i++){
			
			System.out.println(arr3[i]);
		}
        }
}

