/*
 Program 2 : WAP to reverse each element in an array.
	     Take size and elements from the user
		Input: 10 25 252 36 564
		Output: 01 52 252 63 465 
 */

import java.io.*;

class reverseDigit{

        static void digitreverse(int arr[]){
		
		System.out.println("Reverse Elements in an Array : ");
                for(int i = 0 ;i < arr.length; i++){
			int num = arr[i];
			int sum = 0;
			while(num != 0){
				
				int rem = num % 10;
				sum = sum * 10 + rem;
				num /= 10;
			}
			arr[i] = sum;
			System.out.println(arr[i]);
                }
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

                digitreverse(arr);
        }
}

