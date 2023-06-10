/*
 Program 8 : Write a program to create a 2d array of integer elements.
	     Take the number of rows and columns values from the user.
	     And print a 2d array of numbers whose last digit ends with N,
	     take the N value from the user.
	
	Input:
		Enter number of Rows = 2
		Enter number of Column = 2
		Enter value of N = 3
	Output:
		3 13
		23 33
	
	Input:
		Enter number of Rows = 3
		Enter number of Column = 2
		Enter value of N = 4
	Output:
		4 14
		24 34
		44 54
 */

import java.io.*;

class Solution {

        void print2DArray(int arr[][],int n) {

                System.out.println("Output : ");
                int num = 10 + n;

                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[i].length; j++) {

                                if(i == 0 && j == 0) {

                                        arr[i][j] = n;
                                } else {

                                        arr[i][j] = num;
                                        num += 10;
                                }
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

                System.out.println("Enter the N value : ");
                int n = Integer.parseInt(br.readLine());

                int arr[][] = new int[row][col];

                obj.print2DArray(arr,n);
        }
}
