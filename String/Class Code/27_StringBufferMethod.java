/*
 Method 1 : public synchronized StringBuffer append(String str);
 */

class StringBufferMethod {
	
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Dhiraj");

		str.append("Gadekar");

		System.out.println(str);
	}
}
