

class StringDemo{

        public static void main(String[] args){

                String str1 = "Dhiraj";
                String str2 = "Gadekar";

		String str3 = str1 + str2;       //Call Append method (StringBuffer class)
                String str4 = str1.concat(str2); //Call concat method (String class)
		
                System.out.println(str3);
                System.out.println(str4);
        }
}

