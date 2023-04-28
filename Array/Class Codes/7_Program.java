//Sum of all elements in array : 

import java.io.*;

class ArrayDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];
		int sum = 0 ;
                System.out.println("Enter the array Elements : ");
                for(int i = 0 ; i < arr.length; i++){

                        arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
                }

      		System.out.println("Sum  = " + sum);
        }
}
