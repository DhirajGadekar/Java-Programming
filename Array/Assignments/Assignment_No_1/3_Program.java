/*
 Program 3 : WAP to take size of array from user and also take integer elements from user Print
	     product of odd index only
		
		input : Enter size : 6
		Enter array elements : 1 2 3 4 5 6
		output : 48
 */

import java.io.*;

class ArrayDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];
                int product = 1;

                System.out.println("Enter the array Elements : ");
                for(int i = 0 ; i < arr.length; i++){

                        arr[i] = Integer.parseInt(br.readLine());
			
			if(i % 2 == 1){
				
				product = product * arr[i];
			}
                }
		System.out.println("Product of odd Index Elements : " + product);

        }
}
