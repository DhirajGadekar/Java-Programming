//String Reverse :

import java.io.*;

class StringReverse {
 	
	static String reverse(String str) {
		
		char arr[] = str.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while(start < end){
			
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		str = new String(arr);
		return str;
	}
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String : ");
		String str = br.readLine();

		str = reverse(str);
		System.out.println(str);
	}
}
