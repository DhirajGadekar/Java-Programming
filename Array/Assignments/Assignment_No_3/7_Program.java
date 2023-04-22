/*
 Program 7 : WAP to find a Strong number from an array and return its index.
	     Take size and elements from the user
		Input: 10 25 252 36 564 145
		Output: Strong no 145 found at index: 5 
 */

import java.io.*;

class StrongNum{

        static int Strong(int arr[],int arr1[]){
		
		int itr = -1;
                for(int i = 0 ;i < arr.length; i++){
			int sum = 0;
			int num = arr[i];
			while(num != 0){
				int rem = num % 10;
				int fact = 1;
				for(int j = 1; j <= rem; j++){
				
					fact = fact * j;
				}
				sum = fact + sum;
				num /= 10;
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
                int ret = Strong(arr,arr1);
		if(0 <= ret){
			
			for(int i = 0 ; i <= ret; i++){
                        	
				System.out.println("Strong No " + arr[arr1[i]] + " found at index : " + arr1[i]);
			}
                }else{

                        System.out.println("Strong Number Not Found in an Array");
                }
        }
}

