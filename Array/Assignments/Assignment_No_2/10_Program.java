/*
 Program 10 : WAP to print the elements whose addition of digits is even.
		Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
		Input :
			Enter array : 1 2 3 5 15 16 14 28 17 29 123
		Output: 
			2 15 28 17 123
 */

import java.io.*;

class ArrayAssignment{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of Array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                System.out.println("Enter the array Elements : ");
                for(int i = 0;i < arr.length;i++){

                        arr[i] = Integer.parseInt(br.readLine());
                }
		
		System.out.println("Array Elements those addition of digits is even : ");
		for(int i = 0 ; i < arr.length; i++){
			int num = arr[i];
			int sum = 0;
			while(num != 0){
				sum = sum + (num % 10);
				num /= 10;
			}
			if(sum % 2 == 0){
				
				System.out.println(arr[i]);
			}
		}
        }
}

