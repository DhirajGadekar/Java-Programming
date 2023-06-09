/*
 *Program 4 : Write a Java program to find the sum of even and odd numbers in an array.
	      Display the sum value. 
		
	      Example:-Array = {11, 12, 13, 14, 15}
	
	      Odd numbers sum = 39
	      Even numbers sum = 26
 */

import java.io.*;

class Solution {

        void sumEvenOddNum(int arr[]) {

                int evenSum = 0;
                int oddSum = 0;
                for(int i = 0; i < arr.length; i++) {

                        if(arr[i] % 2 == 0) {

                                evenSum += arr[i];
                        } else {

                                oddSum += arr[i];
                        }
                }
                System.out.println("Even Numbers Sum : " + evenSum);
                System.out.println("Odd Numbers Sum : " + oddSum);
        }
}
class ArrayAssignment {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Solution obj = new Solution();

                System.out.println("Enter the length of an Array : ");
                int n = Integer.parseInt(br.readLine());

                int arr[] = new int[n];

                System.out.println("Enter the array Elements : ");
                for(int i = 0 ; i < arr.length; i++) {

                        arr[i] = Integer.parseInt(br.readLine());
                }
                obj.sumEvenOddNum(arr);
        }
}
