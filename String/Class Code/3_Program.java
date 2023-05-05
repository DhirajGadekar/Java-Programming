class Stringdemo{
	
	public static void main(String[] args){
		
		String str1 = "Dhiraj";
		String str2 = str1;

		String str3 = new String(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
