/*
 Program 6 : WAP to find a palindrome number from an array and return its index.
	     Take size and elements from the user
		Input: 10 25 252 36 564
		Output: Palindrome no 252 found at index: 2 
 */

import java.io.*;

class palindromeNum{

        static int palindrome(int arr[],int arr1[]){
		
		int itr = -1;
                for(int i = 0 ;i < arr.length; i++){

			int num = arr[i];
			int sum = 0;
			while(num != 0){
				
				sum = (sum * 10) + (num % 10);
				num /= 10;
			}
			if(arr[i] == sum){
				
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
                int ret = palindrome(arr,arr1);
		if(0 <= ret){

                        for(int i = 0 ; i <= ret; i++){

                                System.out.println("Palindrome No " + arr[arr1[i]] + " found at index : " + arr1[i]);
                        }
                }else{

                        System.out.println("Palindrome Number Not Found in an Array");
                }	
        }
}

