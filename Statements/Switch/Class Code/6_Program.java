//String use in switch case :

class SwitchDemo{
	
	public static void main(String[] args){

		String str = "Mon";                 //String is valid Switch above 1.7 version or 1.7

		switch(str){
			
			case "Mon":
				System.out.println("Monday");
				break;
			case "Tue":
				System.out.println("Tuesday");
				break;
			case "Wed":
				System.out.println("Wednesday");
				break;
			case "Thu":
				System.out.println("Thursday");
				break;
			case "Fri":
				System.out.println("Friday");
				break;
			case "Sat":
				System.out.println("Saturday");
				break;
			case "Sun":
				System.out.println("Sunday");
				break;
			default :
				System.out.println("Monday");
				break;
		}
	}
}
