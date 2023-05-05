/*
  Matrix Transpose
	Problem Description :
		- You are given a matrix A, and you have to return another matrix which is the
	      	  transpose of A.
		- You have to return the Transpose of this 2D matrix.
	NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col
	      and 1 ≤ j ≤ row. The transpose of a matrix switches the element at (i, j)th index to (j, i)th
	      index, and the element at (j, i)th index to (i, j)th index. 
 */

import java.io.*;

class TwoDArray{

        static int[][] matrixTranspose(int arr[][]){

                int arr2[][] = new int[arr.length][arr[0].length];
                for(int i = 0; i < arr.length; i++){
                        
                        for(int j = 0; j < arr[i].length; j++){

                               arr2[i][j] = arr[j][i];
                              
                        }
                }
                return arr2;
        }

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the length of Row : ");
                int row = Integer.parseInt(br.readLine());

                System.out.println("Enter the length of Col : ");
                int col = Integer.parseInt(br.readLine());

                int arr[][] = new int[row][col];

                System.out.println("Enter the Array elements : ");
                for(int i = 0; i < row; i++){

                        for(int j = 0; j < col; j++){

                                arr[i][j] = Integer.parseInt(br.readLine());
                        }
                }

                int arr2[][] = matrixTranspose(arr);
                System.out.println("Matrix Transpose : ");
                for(int i = 0; i < row; i++){

                        for(int j = 0; j < col; j++){

                                System.out.print(arr2[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}

