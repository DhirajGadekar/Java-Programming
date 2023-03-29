//Switch Statement without break :

class SwitchDemo{

	public static void main(String[] args){
		
		int x = 3;
		 switch(x){

			 case 1:
				 System.out.println("One");
			 case 2:
				 System.out.println("Two");
			 case 3:
				 System.out.println("Three");
			 default:
				 System.out.println("Case No Match");

		 }
		 System.out.println("After Switch");
	      		
	}
}	

/*
O/p:

Three
Case No Match
After Switch
*/
