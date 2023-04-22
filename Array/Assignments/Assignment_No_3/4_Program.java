/*
 Program 4 : WAP to find a prime number from an array and return its index.
	     Take size and elements from the user
		Input: 10 25 36 566 34 53 50 100
		Output: prime no 53 found at index: 5 
 */

import java.io.*;

class PrimeNum{

        static int PrimeNum(int arr[],int arr1[]){

		int itr = -1;
                for(int i = 0 ;i < arr.length; i++){

                        int count= 0;
                        for(int j = 1; j <= arr[i]; j++){

                                if(arr[i] % j == 0){

                                        count++;
                                }
                                if(count == 3){
                                        break;
                                }
                        }
                        if(count == 2){

                                itr++;
				arr1[itr] = i;
                        }
                }
                return itr;
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

		int arr1[] = new int[arr.length];
                int ret = PrimeNum(arr,arr1);
		if(0 <= ret){

                        for(int i = 0 ; i <= ret; i++){

                                System.out.println("Prime No " + arr[arr1[i]] + " found at index : " + arr1[i]);
                        }
                }else{

                        System.out.println("Prime Number Not Found in an Array");
                }
               
        }
}                     
