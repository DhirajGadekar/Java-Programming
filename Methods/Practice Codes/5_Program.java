/*
 Program 5 : Automorphic Number
 */

import java.io.*;

class AutoMorphicNum{
	
	static void AutoMorphic(int start,int end){
			
		System.out.println("Automorphic Numbers in range between of " + start + " to " + end + " : ");
		for(int i = start; i <= end; i++){
			
			int sum1 = 0, sum2 = 0;
			int temp = i;
			int sqr = temp * temp;
			while(temp != 0){
				
				int rem1 = temp % 10;
				int rem2 = sqr % 10;

				sum1 = (sum1 * 10) + rem1;
				sum2 = (sum2 * 10) + rem2;

				sqr = sqr / 10;
				temp = temp / 10;

			}
			if(sum1 == sum2){
	
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the range  : ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		AutoMorphic(start,end);
	}
}
