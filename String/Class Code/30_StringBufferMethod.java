
/*
 Method 4 : public synchronized StringBuffer reverse();
 */

class StringBufferMethod {

        public static void main(String[] args) {

                StringBuffer str = new StringBuffer("Dhiraj");

                System.out.println(str);

		System.out.println(str.reverse());
        }
}
