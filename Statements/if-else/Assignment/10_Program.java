//Program 10 : Write a unique real-time example of if Elself Else Ladder.


class Grades{

        public static void main(String[] args){

                float Marks = 80f;


		if(Marks >= 0f && Marks <= 100f){
                	
			if(Marks >= 75.00f && Marks <= 100.00f){
                        
				System.out.println("A grade");
                	}else if(Marks >= 50.0f && Marks <= 74.00f){

                        	System.out.println("B Grade");
                	}else if(Marks >= 35.00f && Marks <= 49.00f){
			
				System.out.println("C Grade");
			}else{

				System.out.println("Fail");
			}
		}else{

			System.out.println("Invalid Marks");
		}
        }
}
