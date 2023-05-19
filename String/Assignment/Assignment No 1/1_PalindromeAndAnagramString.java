/*
Problem : Write a class StringDemo.
	Static method : checkPalindromeString 
	Non static method : checkAnagramStrings 
	
	Palindrome string : String is identical if reversed
	Eg. racecar , madam , etc.
	
	Anagram Strings : 2 Strings are anagram if they contain same 
	                  characters and same number of times.
 */
import java.io.*;

class StringDemo {

	int myLength(String str) {
		
		char arr[] = str.toCharArray();

		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			count++;
		}
		return count;
	}
	static String checkPalindromeString(String str) {
		
		char arr[] = str.toCharArray();

		int start = 0;
		int end = arr.length - 1;

		while(start < end) {
			
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		String str1 = new String(arr);
		return str1;
	}

	int checkAnagramString(String str1, String str2) {
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		if(myLength(str1) == myLength(str2)) {
			
			for(int i = 0; i < arr1.length ;i++) {

                        	for(int j = 0 ; j < arr1.length - 1 - i;j++) {

                                	if(arr1[j] > arr1[j + 1]) {

                                       		char temp = arr1[j];
                                        	arr1[j] = arr1[j + 1];
                                        	arr1[j + 1] = temp;
                                	}
					if(arr2[j] > arr2[j + 1]) {

                                                char temp = arr2[j];
                                                arr2[j] = arr2[j + 1];
                                                arr2[j + 1] = temp;
                                        }
                        	}	
                	}

			for(int i = 0; i < arr1.length; i++) {
				
				if(arr1[i] != arr2[i]) {
					
					return -1;
				}
			}

			return 0;
			
		}else {
			
			return -1;
		}
	}
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringDemo obj = new StringDemo();

		char ch;
		do{
			System.out.println("1. Check Palindrome String");
                	System.out.println("2. Check Anagram String\n");

                	System.out.println("Enter Your Choice :");
                	int choice = Integer.parseInt(br.readLine());
			
			switch(choice){
				
				case 1 :{
						System.out.println("\nEnter the String : ");
						String str = br.readLine();

						String str1 = checkPalindromeString(str);
						
						if(str1.equals(str)) {
						
							System.out.println("Palindrome String");
						}else {

							System.out.println("Not Palindrome String");
						}
					}
					break;
				case 2 :{
						System.out.println("\nEnter the Two Strings :");
						String str1 = br.readLine();
						String str2 = br.readLine();
						
						int ret = obj.checkAnagramString(str1,str2);
						if(ret == 0) {
							
							System.out.println("Anagram String");
						}else {
							
							System.out.println("Not Anagram String");
						}
					}
					break;

				default :
					System.out.println("Wrong Choice");
						
			}
			
			System.out.println("\nIf want check again press [Y | y] else [N | n] : ");
			ch = br.readLine().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}

