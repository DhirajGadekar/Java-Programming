/*
 *Program 7 : WAP to take input from the user into an array and remove duplicate numbers.
	
	Input: 1 2 2 3 3 3 4 4 5
	Output: 1 2 3 4 5
 */
import java.io.*;

class Solution {
	
	int removeDuplicateEle(int arr[]) {

		int itr = 0;
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[itr] == arr[i]) {
				
				continue;
			} else {

				arr[++itr] = arr[i];
			}
		}

		for(int i = itr + 1; i < arr.length; i++) {
			
			arr[i] = 0;
		}
		return itr;
	}
}
class ArrayAssignment {
        
        public static void main(String[] args)throws IOException {
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Solution obj = new Solution();

		System.out.println("Enter the length of an Array : ");
                int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		System.out.println("Enter the array element : ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		int ret  = obj.removeDuplicateEle(arr);

		System.out.println("After removing Elements : ");
		for(int i = 0; i <= ret; i++) {

			System.out.println(arr[i]);
		}
        }
} 

