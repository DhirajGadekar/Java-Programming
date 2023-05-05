
class StringDemo{

	public static void main(String[] args){
		
		String str1 = "Dhiraj";
		String str2 = "Gadekar";

		System.out.println(str1 + str2);   //Call internally Append Method (StringBuffered Class
		
	        String str3 = "DhirajGadekar";     //Object on SCP
      	      	String str4 = str1 + str2;         //Object on Heap

		System.out.println(System.identityHashCode(str3));	
		System.out.println(System.identityHashCode(str4));	
	}
}
