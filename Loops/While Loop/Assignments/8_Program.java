//Program 8 : Write a program to print the countdown of day  to submit the assignment

class Assign{
	
	public static void main(String[] args){
		
		int day = 4;

		while(day >= 0){
			
			if(day == 0){
				System.out.println("0 assignment is overdue");
			}else{
				
				System.out.println(day + "days remaining");
			}
			day--;
		}

	}
}
