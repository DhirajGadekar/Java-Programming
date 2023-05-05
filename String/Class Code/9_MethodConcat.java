/*
	Method : public String concat(String str)
	
	Description : - Conacatinate string to this string i.e Another String is 
		        concatinationated with the first String.
		      - Implements length is sum of str1.length and str2.length

	Parameters : String
	
	Return Type : String
 */

class ConcatMethod {
	
	public static void main(String[] args){
		
		String str1 = "Dhiraj";
		String str2 = "Gadekar";

		String str3 = str1.concat(str2);

		System.out.println(str3);
	}
}
