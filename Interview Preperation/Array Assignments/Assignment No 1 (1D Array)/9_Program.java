/*
Program 9 : Write a program to create an array of ‘n’ integer elements.
	    Where ‘n’ value should be taken from the user.
	    Insert the values from the user and find the strong number from them
	Input:
		n=5
	Enter elements in the array:
		2
		145
		6
		3
		123
		2
	Output:
		145
 */
import java.io.*;

class ArrayAssignment {

	boolean strongNumCheck(int num) {
			
		int sum = 0;
		int temp = num;
		while(num != 0) {
			int num1 = 1;
			int rem = num % 10;
			for(int i = 1; i <= rem; i++) {
				
				num1 = num1 * i;
			}
			sum = sum + num1;
			num /= 10;
		}
		if(temp == sum) {
			
			return true;
		} else {
			
			return false;
		}
	}
	void arrayStrongNum(int arr[]) {
		ArrayAssignment obj = new ArrayAssignment();

		System.out.println("Strong Numbers in an Array : ");
		for(int i = 0; i < arr.length; i++) {
			
			boolean ret = obj.strongNumCheck(arr[i]);
			if(ret) {
				
				System.out.println(arr[i]);
			}
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
		
		obj.arrayStrongNum(arr);
	}
}
