/*
 Program 10 : WAP to Take a number as input, put that number into an array i.e one digit per array
	      block, and print the number of trailing zeros in that array.
	
	      Input from user: 10900
	      Output: Number of trailing zeros: 2
 */
import java.io.*;

class Solution {
	
	int trailingZero(int num) {

 		int temp = num;
                int itr = 0;
                while(num != 0) {
                        itr++;
                        num /= 10;
                }

                num = temp;
                int arr[] = new int[itr];
                itr = 0;
                while(num != 0) {

                        arr[itr] = num % 10;
                        itr++;
                        num /= 10;
                }
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 0) {
				
				count++;
			} else {
				
				break;
			}
		}
		return count;
	}
}
class ArrayAssignment {
        
        public static void main(String[] args)throws IOException {
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Solution obj = new Solution();

		System.out.println("Enter the Number : ");
                int num = Integer.parseInt(br.readLine());
		
		int count = obj.trailingZero(num);
		System.out.println("Number of Trailing Zeros : " + count);
        }
} 
