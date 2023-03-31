/*
Program 6 : Take N as input print whether its prime or not 
 */

class primeNum{

        public static void main(String[] args){

                int N = 5;
		int count = 0;
                for(int i = 1;i <= N;i++){

                        if(N % i == 0){
				
				count++;
			}
                }
		if(count == 2){
			
			System.out.println(N + " is a prime Number");
		}else{

			System.out.println(N + " is a not prime Number");
		}
        }
}

