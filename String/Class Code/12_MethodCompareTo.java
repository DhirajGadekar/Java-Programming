/*
	Method : public static compareTo(String str)

	Description : It compare the str1 and str2 (case Sensitive) if both the string are 
		      equal it return 0 otherwise return the comparision

	Parameter : String (second String) 

	Return Type : integer 
 */

class MethodCompareTo{
	
	public static void main(String[] args){
		
		String str1 = "Ashish";
		String str2 = "AsHish";

		System.out.println(str1.compareTo(str2));
	}
}
