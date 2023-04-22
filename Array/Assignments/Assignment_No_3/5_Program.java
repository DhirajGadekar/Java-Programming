/*
  Program 5 : WAP to find a Perfect number from an array and return its index.
	      Take size and elements from the user
		Input: 10 25 252 496 564
		Output: Perfect no 496 found at index: 3 
 */

import java.io.*;

class PerfectNum{

        static int PerfectNum(int arr[],int arr1[]){

		int itr = -1;
                for(int i = 0 ;i < arr.length; i++){
			
			int sum = 0;
			for(int j = 1; j < arr[i]; j++){
				
			      if(arr[i] % j == 0){
				      
				      sum = sum + j;
			      }
		        }
			if(sum == arr[i]){
				
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
                int ret = PerfectNum(arr,arr1);
                if(0 <= ret){

                        for(int i = 0 ; i <= ret; i++){

                                System.out.println("Perfect No " + arr[arr1[i]] + " found at index : " + arr1[i]);
                        }
                }else{

                        System.out.println("Perfect Number Not Found in an Array");
                }
        }
}
