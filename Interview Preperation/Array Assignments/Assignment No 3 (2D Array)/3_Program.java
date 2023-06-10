/*
 Program 3 : Write a program to create a (row x column) 2d array of integer elements.

	     -Take the number of rows and columns values from the user.
	     -Insert the values from user and print accordingly

	Input:
		Enter number of Rows = 2
		Enter number of Column = 2
		
		Enter elements in the array :
						1
						2
						3
						4
	Output:
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
		
		System.out.println("Enter the length of Row : ");
		int row = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the length of Col : ");
		int col = Integer.parseInt(br.readLine());
                
		int arr[][] = new int[row][col];

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
