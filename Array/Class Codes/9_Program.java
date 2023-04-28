//All even and odd element count : 

import java.io.*;

class arrayDemo{

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                int evenCount = 0;
                int oddCount = 0;
                System.out.println("Enter the array Elements : ");
                for(int i = 0 ; i < arr.length; i++) {

                        arr[i] = Integer.parseInt(br.readLine());

                        if(arr[i] % 2 == 0) {
                                evenCount++;
                        }else{
				oddCount++;
			}
                }

                System.out.println("Array Even Elements count : " + evenCount);
                System.out.println("Array Odd Elements count : " + oddCount);
        }
}
