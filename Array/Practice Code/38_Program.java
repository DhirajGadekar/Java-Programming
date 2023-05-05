/* Rotate matrix

	Problem Description :
		- You are given a n x n 2D matrix A representing an image.
		- Rotate the image by 90 degrees (clockwise).
		- You need to do this in place.
	Note: If you end up using an additional array, you will only receive
	      a partial score.
*/

import java.io.*;

class TwoDArray{

        static int[][] rotateMatrix(int arr[][]){

    		int arr2[][] = new int[arr.length][arr[0].length];
                for(int i = 0; i < arr.length; i++){
			int k = arr.length - 1;
                        for(int j = 0; j < arr[i].length; j++){

                               arr2[i][j] = arr[k][i];
			       k--;
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

                int arr2[][] = rotateMatrix(arr);
		System.out.println("After Rotating Array : ");
                for(int i = 0; i < row; i++){

                        for(int j = 0; j < col; j++){

                                System.out.print(arr2[i][j] + " ");
                        }
			System.out.println();
             	}
        }
}
