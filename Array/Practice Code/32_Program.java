/*
 Program 32 : #LeetCode - Easy
 	
 	      You are given an array prices where prices[i] is the price of a given stock on the ith day.
	      You want to maximize your profit by choosing a single day to buy one stock and choosing a 
	      different day in the future to sell that stock.
		
	      Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
		
	      Example 1:
			Input: prices = [7,1,5,3,6,4]
			Output: 5
			Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
					
			Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
		
	       Example 2:
			Input: prices = [7,6,4,3,1]
			Output: 0
			Explanation: In this case, no transactions are done and the max profit = 0.
 
	       Constraints:
			1 <= prices.length <= 105
			0 <= prices[i] <= 104
 */

import java.io.*;

class BuyAndSell{
	
	static int BuyandSell(int arr[]){
		
		int min = arr[0];
		int minele = 0;
		for(int i = 1 ; i < arr.length; i++){
			
			if(min > arr[i]){
				minele = i;	
				min = arr[i];
			}
		}
		int max = arr[minele];
		for(int i = minele; i < arr.length; i++){

			
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max - min;
	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];

		System.out.println("Enter the day wise price of stock : ");
		for(int i = 0 ; i < size; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
		}

		int profit = BuyandSell(arr);
		System.out.println("Profit : " + profit);
	}
}
