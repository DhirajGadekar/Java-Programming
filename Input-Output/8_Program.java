/*
 Program 8 : StringTokenizer
 */

import java.io.*;
import java.util.*;

class matchInfo{
	
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the player Name,Grade,Average : ");
		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info, ",");

		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();

		System.out.println("Player Name : " + token1);
		System.out.println("Player Gade : " + token2);
		System.out.println("Player Average : " + token3);
	}
}
