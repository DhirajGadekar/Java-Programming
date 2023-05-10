/*
 Method 3 : public synchronized StringBuffer delete(int start, int end);
 */

class StringBufferMethod {

        public static void main(String[] args) {

                StringBuffer str = new StringBuffer("Dhiraj");

   		str.delete(2,4);
                System.out.println(str);
        }
}
