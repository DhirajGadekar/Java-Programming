/*
 Program 4 : Write a program, take 7 characters as an input , Print only vowels from the array
		Input: a b c o d p e
		Output : a o e
 */

import java.io.*;

class ArrayDemo{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of array : ");
                int size = Integer.parseInt(br.readLine());

                char arr[] = new char[size];
                
                System.out.println("Enter the array Elements : ");
                for(int i = 0 ; i < arr.length; i++){

                        arr[i] = (char)br.readLine().charAt(0);
			
                }

		System.out.println("Vowels In Array : ");
		for(int i = 0 ; i < arr.length; i++){
			
			if(arr[i] == 'a' || arr[i] == 'o' || arr[i] == 'i' || arr[i] == 'u' || arr[i] == 'e' || arr[i] == 'A' || arr[i] == 'O' || arr[i] == 'I' || arr[i] == 'U' || arr[i] == 'E'){
				
				System.out.println(arr[i]);
			}
		}

        }
}
