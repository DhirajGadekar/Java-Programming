/*
 Program 1 : Take N as input print Factorial
 */

class factorial{

        public static void main(String[] args){

                int N = 5;
		int fact = 1;
                for(int i = 1;i <= N;i++){

                        fact = fact * i;
                }
		System.out.println("Factorial of "+ N +" is " + fact);
        }
}

