/*
Program 6 : Write a program to create an array of ‘n’ integer elements.
	    Where ‘n’ value should be taken from the user.
	    Insert the values from users and find the min number from the array

	Input:
		n=6
	Enter elements in the array:
		2
		3
		6
		9
		5
		1
	Output:
		1
 */
import java.io.*;

class ArrayAssignment {

        int minElementInArray(int arr[]) {

                int min = arr[0];
                for(int i = 1; i < arr.length; i++) {

                        if(min > arr[i]) {

                                min = arr[i];
                        }
                }
                return min;
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

                int minEle = obj.minElementInArray(arr);
                System.out.println("Min Element In an Array : " + minEle);
        }
}
