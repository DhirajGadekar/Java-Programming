/*
 Program 4 : WAP to search a specific element from an array and return its index.
		Input: 
			1 2 4 5 6
			Enter element to search: 4
		Output: 
			element found at index: 2
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

		
                System.out.println("Enter ELement to Search : ");
                int search = Integer.parseInt(br.readLine());
		int flag = 0;
                for(int i = 0;i < arr.length;i++){

                        if(search == arr[i]){
				flag = 1;	
				System.out.println("Element Found At Index = " + i);
				break;
			}
                }
		if(flag == 0){
			System.out.println("Element Not Found");
		}
        }
}

