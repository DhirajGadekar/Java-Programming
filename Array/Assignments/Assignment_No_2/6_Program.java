/*
 Program 6 : WAP to take size of array from user and also take integer elements from user
	     find the maximum element from the array
		input : 
			Enter size : 5
			Enter array elements: 1 2 5 0 4
		output: 
			max element = 5

 */

import java.io.*;

class ArrayAssignment{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of Array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                System.out.println("Enter the array Elements : ");
                for(int i = 0;i < arr.length;i++){

                        arr[i] = Integer.parseInt(br.readLine());
                }
		int max = arr[0];

		for(int i = 1;i < arr.length;i++){
			
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("Max Element : " + max);
        }
}

