// Method : indexOf()

import java.io.*;

class MethodIndexOf {
	
	static int myLength(String str) {
		
		char arr[] = str.toCharArray();

		int count = 0;
		for(int i : arr){
			
			count++;
		}
		return count;
	}
	static int myIndexOf(String str, char ch, int num){
		
		char arr[] = str.toCharArray();

		if(myLength(str) > num && num > -1) {
			
			for(int i = num; i < arr.length; i++) {
				
				if(ch == arr[i]){
					
					return i;
				}
			}
		}else {
			
			return -1;
		}
		return -1;
	}
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a String : ");
		String str = br.readLine();
		
		System.out.println("Enter a Character : ");
		char ch = br.readLine().charAt(0);

		System.out.println("Enter the Index : ");
		int num = Integer.parseInt(br.readLine());

		int ret = myIndexOf(str,ch,num);
		System.out.println(ret);
	}
}
