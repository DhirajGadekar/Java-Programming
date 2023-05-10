
class SBDemo {
	
	public static void main(String[] args) {
		
		String str1 = "Shashi";
		String str2 = new String("Bagal");
		StringBuffer str3 = new StringBuffer("Core2Web");

		String str4 = str1.append(str3);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}

/*
 O/p :

  Error: cannot find symbol
		String str4 = str1.append(str3);
		                  ^
  symbol:   method append(StringBuffer)
  location: variable str1 of type String

 */
