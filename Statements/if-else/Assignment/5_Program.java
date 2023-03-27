//Program 5: Write a java program in which according to month no the print no. of days in that Months.


class Year{

        public static void main(String[] args){

                int Month = 9;

              	if(Month == 1){
			System.out.println("Jan has 31 days");
                }else if(Month == 2){
                                
			System.out.println("Feb has 28/29 days");
		}else if(Month == 3){

			System.out.println("March has 31 days");
		}else if(Month == 4){
        
			System.out.println("April has 30 days");                        
		}else if(Month == 5){

			System.out.println("May has 31 days");        
		}else if(Month == 6){

			System.out.println("Jun has 30 days");
		}else if(Month == 7){
                        
			System.out.println("July has 31 days");
                }else if(Month == 8){

                        System.out.println("Aug has 31 days");
                }else if(Month == 9){

                        System.out.println("Sep has 30 days");
                }else if(Month == 10){

                        System.out.println("Oct has 31 days");
                }else if(Month == 11){

                        System.out.println("Nov has 30 days");
                }else if(Month == 12){

                        System.out.println("Dec has 31 days");
                }else{
			
			System.out.println("Invalid Number");
		}
 
        }
}
