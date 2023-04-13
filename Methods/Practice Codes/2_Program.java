/*
 Program 2 : ArmStrong Number Between Range : 
 */

import java.io.*;

class Armstrong{
	
	void ArmStrong_Num(int start, int end){
		
		for(int i = start; i <= end; i++){
			
			int temp = i;
			int sum = 0;
			int count = 0;

			while(temp != 0){
				count++;
				temp = temp/10;
			}
			
			temp = i;
			while(temp != 0){
				
				int rem = temp % 10;

				int mult = 1;
				for(int j = 1; j <= count; j++){

					mult = mult * rem;
				}
				sum = sum + mult;
				temp = temp / 10;
			}
			if(i == sum){
				System.out.println(i);
			}
		}

	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));
		Armstrong obj2 = new Armstrong();

		System.out.println("Enter the Range : ");
		int start = Integer.parseInt(obj1.readLine());
		int end = Integer.parseInt(obj1.readLine());

		obj2.ArmStrong_Num(start,end);
	}
}
