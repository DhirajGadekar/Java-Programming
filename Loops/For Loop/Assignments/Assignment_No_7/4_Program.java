/*
 Prpgram 4 :  Write a program to take a range as input from the user and print perfect cubes between that range.
		Input: Enter start: 1
		       Enter end: 100
		Output: perfect cubes between 1 and 100
 */

import java.io.*;

class PerfectCube{

        static void Perfect_Cude(int start, int end){

                System.out.println("Perfect Cude between the " + start + " to " + end +" : ");

                for(int i = start; i*i*i <= end; i++){


                        System.out.println(i * i * i);
                }

        }

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the start : ");
                int start = Integer.parseInt(br.readLine());
                System.out.println("Enter the end : ");
                int end = Integer.parseInt(br.readLine());

                Perfect_Cude(start,end);
        }
}

