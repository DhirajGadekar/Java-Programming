// Myreplace :

import java.io.*;

class MethodReplace {
	
	String myReplace(String str, char ch1, char ch2) {
		
		char arr[] = str.toCharArray();

		for(int i = 0 ; i < arr.length; i++){
			
			if(ch1 == arr[i]){
				
				arr[i] = ch2;
			}
		}

		str = new String(arr);

		return str;
	}
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MethodReplace obj = new MethodReplace();

		System.out.println("Enter the String : ");
		String str = br.readLine();
		
		System.out.println("Enter the old character : ");
		char ch1 = br.readLine().charAt(0);
		
		System.out.println("Enter the new character : ");
		char ch2 = br.readLine().charAt(0);
		
		str = obj.myReplace(str,ch1,ch2);
		System.out.println(str);
	}
}
