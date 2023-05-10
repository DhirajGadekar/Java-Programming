// SubString With one parameter :

import java.io.*;

class MethodSubString {
	
	static String mySubString(String str, int index) {

		char arr1[] = str.toCharArray();
		if(arr1.length <= index || 0 > index) {
			
			str = "StringIndexOutOfBoundException";
			return str;
		}else {
			char arr2[] = new char[arr1.length - index];
		
			int itr = 0;
			for(int i = index; i < arr1.length; i++){
			
				arr2[itr] = arr1[i];
				itr++;
			}

			str = new String(arr2);
			return str;
		}
	}
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String : ");
		String str = br.readLine();

		System.out.println("Enter the Index : ");
		int index = Integer.parseInt(br.readLine());

		String str1 = mySubString(str,index);
	        System.out.println(str1);	
	}
}
