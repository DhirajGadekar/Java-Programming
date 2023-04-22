/*
 Program 3 : WAP to find a composite number from an array and return its index.
	     Take size and elements from the user
		Input: 1 2 3 5 6 7
		Output: composite 6 found at index: 4
 */

import java.io.*;

class CompositeNum{

        static int CompositeNum(int arr[],int arr1[]){
		
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
			if(count > 2){
				
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
                int ret = CompositeNum(arr,arr1);
		if(0 <= ret){

                        for(int i = 0 ; i <= ret; i++){

                                System.out.println("Composite No " + arr[arr1[i]] + " found at index : " + arr1[i]);
                        }
                }else{

                        System.out.println("Composite Number Not Found in an Array");
                }
        }
}

