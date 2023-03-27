//Program 9:Write a program in java to accept three number and check whether they are Pythagorean or not.


class Pythagorean{

        public static void main(String[] args){

                int a = 4;
                int b = 3;
                int c = 5;			
		
		if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){                        
			
			System.out.println("its pythagorean triplet");
               	}else{

                       	System.out.println("its Not pythagorean triplet");
                }
		
        }
}

