//Length Method : 

import java.io.*;

class MyLength {
	
	static int myLength(String str){
		
		char[] arr = str.toCharArray();
		int count = 0;
		for(int i : arr){
			count++;
		}
		return count;
	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String : ");
		String  str = br.readLine();

		int count = myLength(str);
		System.out.println(count);
	}

}
