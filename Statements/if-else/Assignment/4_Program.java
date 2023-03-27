/*Program 4 : Write a java program that checks a number from 0 to 5
 	and print its spelling if the number is greater than 5 print 
	number is greater than 5
*/

class Spelling{

        public static void main(String[] args){

                int num = 4;
		
		if(num > 0){
			if( num == 0){
				
				System.out.println("Zero");
			}else if(num == 1){
                        	
				System.out.println("One");
                	}else if(num == 2){
                        	
				System.out.println("Two");
                	}else if(num == 3){
                        	
				System.out.println("Three");
                	}else if(num == 4){
                        	
				System.out.println("Four");
                	}else if(num == 5){
				
				System.out.println("Five");
			}else{
				
				System.out.println(num +" is greater than 5");
			}
		}else{
			System.out.println("Invalid Number");
		}
        }
}


