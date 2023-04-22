/*
 Program 10 : Write a program to print the second min element in the array
		Input: Enter array elements: 255 2 1554 15 65 95 89
		Output: 15  
 */

import java.io.*;

class SecondMin{

        static int SecondMin(int arr[]){

		for(int i = 0;i < arr.length-1;i++){

                        for(int j = 0;j < arr.length-1-i;j++){

                                if(arr[j] < arr[j + 1]){
                                        int temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j  + 1] = temp;
                                }
                        }
                }
                return arr[arr.length - 2];
	
        }
        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                System.out.println("Enter the array elements: ");
                for(int i = 0; i < arr.length; i++){

                        arr[i] = Integer.parseInt(br.readLine());
                }

                int ret = SecondMin(arr);
		System.out.println("Second Minimun Array Element : "+ ret);
        }
}


