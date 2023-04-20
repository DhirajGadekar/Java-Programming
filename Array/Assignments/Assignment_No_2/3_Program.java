/*
 Program 3 : Write a Java program to find the sum of even and odd numbers in an array.
	     Display the sum value.
		Input: 11 12 13 14 15
		Output
			Odd numbers sum = 39
			Even numbers sum = 26
 */

import java.io.*;

class ArrayAssignment{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of Array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];
		
		int EvenSum = 0 ,OddSum = 0;

                System.out.println("Enter the array Elements : ");
                for(int i = 0;i < arr.length;i++){

                        arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] % 2 == 0){
				EvenSum = EvenSum + arr[i];
			}else{
				OddSum = OddSum + arr[i];
			}
                }
		System.out.println("Odd numbers sum = " + OddSum);
		System.out.println("Even numbers sum = " + EvenSum);
        }
}

