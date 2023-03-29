//Duplicate Case :

class SwicthDemo{
	
	public static void main(String[] args){
		
		int num = 3;
		int a = 1;
		switch(num){
			
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 3:                                             //Error : Duplicate variable
				System.out.println("Second time Three");
				break;
			case a + a:	                                    // Error : Constant expression is required 
				System.out.println("one + one");
				break;
			case 1 + 4:                                         //Constant expression is valid
				System.out.println("one + one");            
				break;
			default:
				System.out.println("Case No Match");
		}	
	}

}
