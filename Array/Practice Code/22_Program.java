/*
 Program 21 : Given an array of N integers. Find the first element that occurs at least K number of times.
 	      Input :
	      		N = 7, K = 2
              		A[] = {1, 7, 4, 3, 4, 8, 7}
              Output :
			4
   	      Explanation:
			Both 7 and 4 occur 2 times. 
			But 4 is first that occurs 2 times
			As at index = 4, 4 has occurred 
			atleast 2 times whereas at index = 6,
			7 has occurred atleast 2 times.
 */

import java.io.*;

class Array_occ{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		System.out.println("Enter the array elements in array : ");
		for(int i = 0 ; i < N; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the Occurance Number : ");
		int K = Integer.parseInt(br.readLine());
		
		int count = 0;
		if(K == 1){
			
			System.out.println("first element that occurs at least " + K + " times is " +arr[0]);
		}else{
			for(int i = 0 ; i < N; i++){
			
				for(int j = 0; j < N; j++){
				
					if(arr[i] == arr[j] && i != j){
					
						count++;
					}
				}
				if(count == K){
					System.out.println("first element that occurs at least " + K + " times is " +arr[i]);
					break;
				}	
			}
		
			if(count <= 1){

				System.out.println("Not occurs at least " + K +" number of times.");
			}
		}
	}
}

