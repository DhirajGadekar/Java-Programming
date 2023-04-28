//Count all even element in array :

import java.io.*;

class arrayDemo{

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

		int count = 0; 
                System.out.println("Enter the array Elements : ");
                for(int i = 0 ; i < arr.length; i++) {

                        arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] % 2 == 0) { 
				count++;
			}
                }

                System.out.println("Array Even Elements count : " + count);
        }
}
