
class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer(100);

		str.append("Biencaps");
		str.append("Core2Web");

		System.out.println(str);

		str.append("Incubator");
		System.out.println(str);
		System.out.println(str.capacity());
	}
}
