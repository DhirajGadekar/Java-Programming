/*
 *Program 9 : Take any number from the user and find a pair in an array which sums match to that
	      number.
		E.g int arr[6]={2,4,1,6,8,5}
	input : 10
	output : index 0 , index 4
 */

import java.io.*;

class Solution {
	
	void pairSum(int arr[],int k) {
		int flag = 0;

		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] + arr[j] == k) {
					flag = 1;			
					System.out.println("Index " + i + " , Index " + j);
					break;
				}
			}
			if(flag == 1) {
				
				break;
			}
		}
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
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the Sum : ");
		int k = Integer.parseInt(br.readLine());

		obj.pairSum(arr,k);
        }
} 
