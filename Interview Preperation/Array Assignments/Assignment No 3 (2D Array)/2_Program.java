/*
 Program 2 : Write a program to create a 2x2 2d array of integer elements.
	     Insert values from user And print all elements from a 2d array
	
	Input:
		1
		2
		3
		4	
	Output :
		1 2
		3 4
 */
import java.io.*;

class Solution {

        void print2DArray(int arr[][]) {

		System.out.println("Output : ");
                for(int i[] : arr) {

                        for(int j : i) {

                                System.out.print(j + " ");
                        }
                        System.out.println();
                }
        }
}

class TwoDArrayAssignment {

        public static void main(String[] args)throws IOException {

                Solution obj = new Solution();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[][] = new int[2][2];

                System.out.println("Enter 2D Array Elements : ");
                for(int i = 0; i < arr.length; i++) {
                        System.out.println("Column " + i);
                        for(int j = 0; j < arr[i].length; j++) {

                                arr[i][j] = Integer.parseInt(br.readLine());
                        }
                }

                obj.print2DArray(arr);
        }
}
