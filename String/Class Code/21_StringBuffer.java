
class SBDemo {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer();

		System.out.println(str);
		System.out.println(str.capacity());
		
		str.append("Shashi");
		System.out.println(str);
		System.out.println(str.capacity());
		
		str.append("Bagal");
		System.out.println(str);
		System.out.println(str.capacity());
		
		str.append("Core2Web");
		System.out.println(str);
		System.out.println(str.capacity());
	}
}
