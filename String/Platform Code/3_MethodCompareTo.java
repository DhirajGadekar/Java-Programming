//Compareto :

import java.io.*;

class MyCompareTo {

        static int myLength(String str){

                char[] arr = str.toCharArray();
                int count = 0;
                for(int i : arr){
                        count++;
                }
                return count;
        }

        static int myCompareTo(String str1, String str2) {

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		int diff = 0;
		int len1 = myLength(str1);
		int len2 = myLength(str2);

                if(len1 == len2){
				
			for(int i = 0; i < arr1.length; i++){
				
				if(arr1[i] != arr2[i]){
					
					diff = arr1[i] - arr2[i];
					break;			
				}
			}
                        
                }else{

                       diff = len1 - len2; 
                }
		return diff;

        }
        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter 1st String : ");
                String  str1 = br.readLine();

                System.out.println("Enter 2nd String : ");
                String  str2 = br.readLine();

                int diff = myCompareTo(str1,str2);
		System.out.println(diff);
        }

}

