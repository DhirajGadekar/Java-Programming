/*
 Prpgram 7 : Write a program to take range as input from the user and print the reverse of all numbers. ( Take a
	     start and end number from a user )
		Input: Enter start: 100
		       Enter end: 200
		Output: Reverse numbers between 100 and 250  
 */

import java.io.*;

class NestedAssignment{

        static void Reverse(int start,int end){
		
		System.out.println("Reverse numbers between "+start+" and "+end +" :");
		for(int i = start; i <= end;i++){
			
			int sum = 0;
			int num = i;
			while(num != 0 ){

				sum = (sum * 10) + (num % 10);
				num /= 10;
			}
			if(i == sum){
				System.out.println(i);
			}
		}
        }
        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Start : ");
                int start = Integer.parseInt(br.readLine());
                System.out.println("Enter the End : ");
                int end = Integer.parseInt(br.readLine());

                Reverse(start,end);

        }
}
