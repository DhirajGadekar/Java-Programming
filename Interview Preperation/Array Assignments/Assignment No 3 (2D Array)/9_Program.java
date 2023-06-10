/*
 Program 9 : Print this pattern using an array.
	     Take row value from the user (note: you can use jagged array)
		*
		* *
		* * *
		* * * *
 */
import java.io.*;

class Solution {

        void print2DArray(char arr[][]) {

		for(char i[] : arr) {
			
			for(char j : i ) {
				
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

		System.out.println("Enter the Number of rows : ");
		int row = Integer.parseInt(br.readLine());

                char arr[][] = new char[row][];

		for(int i = 0; i < row; i++) {

			arr[i] = new char[i + 1];
		}

		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j]= '*';
			}
		}
                obj.print2DArray(arr);
        }
}
