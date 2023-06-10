/*
Program 8 : Write a program to create an array of ‘n’ integer elements.
	    Where ‘n’ value should be taken from the user.
	    Insert the values from the user and find the frequency of digit
	
	Input:
		n=5
	Enter elements in the array:
		2
		3
		6
		3
		5
		2
	Output:
		frequency of 2 is 2
		frequency of 3 is 2
		frequency of 6 is 1
		frequency of 5 is 1
 */

import java.io.*;

class ArrayAssignment {

	static boolean repitation(int arr[], int target) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if(target == arr[i]) {
				
				return true;
			}
		}
		return false;
	}

        void frequencyofDigit(int arr1[]) {
		
		int arr2[] = new int[arr1.length];
		int itr = 0;
                for(int i = 0; i < arr1.length; i++) {

			int count = 0;
                        for(int j = 0; j < arr1.length; j++) {
				
				if(arr1[i] == arr1[j]) {
					
					count++;
				}
			}

			if(!repitation(arr2,arr1[i])) {
				
				System.out.println("Frequency of " + arr1[i] + " is " + count);
			}
			arr2[itr] = arr1[i];
			itr++;
			
                }
        }
        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                ArrayAssignment obj = new ArrayAssignment();

                System.out.println("Enter the length of Array : ");
                int n = Integer.parseInt(br.readLine());

                int arr[] = new int[n];

                System.out.println("Enter an Array Elements : ");
                for(int i = 0; i < arr.length; i++) {

                        arr[i] = Integer.parseInt(br.readLine());
                }

                obj.frequencyofDigit(arr);
        }
}
