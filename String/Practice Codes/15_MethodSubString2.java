// SubString With two parameter :

import java.io.*;

class MethodSubString {

        static String mySubString(String str, int start, int end) {

                char arr1[] = str.toCharArray();
                
		if(start == end) {
			
			str = new String();
			return str;	
		}else if(arr1.length < end || 0 > start || arr1.length < start || 0 > end) {

                        str = "StringIndexOutOfBoundException";
                        return str;
                }else {

                        char arr2[] = new char[end - start];
                        int itr = 0;
                        for(int i = start; i < end; i++){

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

                System.out.println("Enter start Index : ");
                int start = Integer.parseInt(br.readLine());
                
		System.out.println("Enter end Index : ");
                int end = Integer.parseInt(br.readLine());

                String str1 = mySubString(str,start,end);
                System.out.println(str1);
        }
}

