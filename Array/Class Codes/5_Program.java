//Taking character array from User :

import java.io.*;

class ArrayDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                char arr[] = new char[size];

                System.out.println("Enter the array Elements : ");
                for(int i = 0 ; i < arr.length; i++){

                        arr[i] = br.readLine().charAt(0);
		
                }

                System.out.println("Array Elements : ");
                for(int i = 0 ; i < arr.length; i++){

                        System.out.println(arr[i]);
                }
                
        }
}
