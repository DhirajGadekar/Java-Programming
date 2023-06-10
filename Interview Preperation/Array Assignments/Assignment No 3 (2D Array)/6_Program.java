/*
 Program 6 : Write a program to create a row x column 2d array of integer elements.
	     Take the number of rows and columns values from the user.
	     And print a 2d array of palindrome numbers (exclude single digit)

	Input:
		Enter number of Rows = 2
		Enter number of Column = 2
	Output:
		11 22
		33 44

	Input:
		Enter number of Rows = 3
		Enter number of Column = 2
	
	Output:
		11 22
		33 44
		55 66
 */
import java.io.*;

class Solution {

        void print2DArray(int arr[][]) {

                int num = 11;
                System.out.println("Output : ");
                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[i].length; j++) {

                                arr[i][j] = num;
                                num += 11;
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

