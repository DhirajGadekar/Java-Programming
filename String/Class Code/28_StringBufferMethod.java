/*
 Method 2 : public synchronized StringBuffer insert(int offset, String str);
 */

class StringBufferMethod {

        public static void main(String[] args) {

                StringBuffer str = new StringBuffer("Core2Web");

                System.out.println(str);

		str.insert(8, "Bagal");
                System.out.println(str);
        }
}
