/*
 Program 5 : Write a program to create a row x column 2d array of integer elements.
	     Take the number of rows and columns values from the user.
	     And print a 2d array of numbers which are multiples of 10.

	Input:
		Enter number of Rows = 2
		Enter number of Column = 2
	Output:
		10 20
		30 40
	Input:
		Enter number of Rows = 3
		Enter number of Column = 2
	Output:
		10 20
		30 40
		50 60
 */

import java.io.*;

class Solution {

        void print2DArray(int arr[][]) {

                int num = 10;
                System.out.println("Output : ");
                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[i].length; j++) {

                                arr[i][j] = num;
                                num += 10;
                                System.out.print(arr[i][j] + " ");
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

                obj.print2DArray(arr);
        }
}

