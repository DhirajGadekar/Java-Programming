// Compare Length :

import java.io.*;

class CompareLength {

        static int myLength(String str){

                char[] arr = str.toCharArray();
                int count = 0;
                for(int i : arr){
                        count++;
                }
                return count;
        }

	static void compareLength(String str1, String str2){
		
		if(myLength(str1) == myLength(str2)){
			
			System.out.println("Length Equal");
		}else{

			System.out.println("Length Not Equal");
		}

	}
        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter 1st String : ");
                String  str1 = br.readLine();
                
		System.out.println("Enter 2nd String : ");
                String  str2 = br.readLine();

                compareLength(str1,str2);
                
        }

}

