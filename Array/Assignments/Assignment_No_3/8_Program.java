/*
 Program 8 : WAP to find an ArmStong number from an array and return its index.
	     Take size and elements from the user
		Input: 10 25 252 36 153 55 89
		Output: Armstrong no 153 found at index: 4  
 */

import java.io.*;

class ArmStrongNum{

        static int ArmStrong(int arr[],int arr1[]){

                int itr = -1;
                for(int i = 0 ;i < arr.length; i++){
                        int count = 0;
			int sum = 0;
                        int num = arr[i];
			while(num != 0){
				
				count++;
				num /= 10;
			}
			num = arr[i];
                        while(num != 0){
                                int rem = num % 10;
                                int mul = 1;
                                for(int j = 1; j <= count; j++){

                                        mul = mul * rem;
                                }
                                sum = mul + sum;
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
                int ret = ArmStrong(arr,arr1);
                if(0 <= ret){

                        for(int i = 0 ; i <= ret; i++){

                                System.out.println("ArmStrong No " + arr[arr1[i]] + " found at index : " + arr1[i]);
                        }
                }else{

                        System.out.println("ArmStrong Number Not Found in an Array");
                }
        }
}

