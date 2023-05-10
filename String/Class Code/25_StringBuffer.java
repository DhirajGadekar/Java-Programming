
class SBDemo {

        public static void main(String[] args) {

                String str1 = "Shashi";
                String str2 = new String("Bagal");
                StringBuffer str3 = new StringBuffer("Core2Web");

                String str4 = str1.concat(str3);
		
                System.out.println(str1);
                System.out.println(str2);
                System.out.println(str3);
                System.out.println(str4);
        }
}

/*
 O/p :
  Error: method concat in class String cannot be applied to given types;
                String str4 = str1.concat(str3);
                                  ^
  required: String
  found:    StringBuffer
  reason: argument mismatch; StringBuffer cannot be converted to String

 */
