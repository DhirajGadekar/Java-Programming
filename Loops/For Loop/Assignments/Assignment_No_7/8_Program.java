/*
 Prpgram 8 : Write a program to take range as input from the user and print Palindrome numbers. ( Take a start and
	     end number from a user )
		Input: Enter start: 100
		       Enter end: 250
		Output: Palindrome numbers between 100 and 250
			101 111 121 131 141 151 161 171 181 191 202 212 222
*/

import java.io.*;

class NestedAssignment{

        static void Palindrome(int start,int end){

                System.out.println("Palindrome numbers between "+start+" and "+end +" :");
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

                Palindrome(start,end);

        }
}
