// CompareToIgnoreCase : 

import java.io.*;

class MyCompareToIgonreCase {
	
	static int myLength(String str){
		
		char arr[] = str.toCharArray();

		int count = 0;	
		for(int i : arr){
			count++;
		}
	
		return count;
	}
	static int myCompareToIgnoreCase(String str1,String str2) {
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		int len1 = myLength(str1);
		int len2 = myLength(str2);
		int diff = 0;

		if(len1 == len2){
			
			for(int i = 0; i < arr2.length; i++){
				
				if(arr1[i] == arr2[i] || (arr1[i] - arr2[i] == -32) || (arr1[i] - arr2[i] == 32)){
							
					continue;
				}else{
					
					return arr1[i] - arr2[i];
				}
			}	
		}else{
			
			return len1 - len2;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st String : ");
		String str1 = br.readLine();
		
		System.out.println("Enter 2nd String : ");
		String str2 = br.readLine();

		int ret = myCompareToIgnoreCase(str1,str2);	
		System.out.println(ret);
	}
}
