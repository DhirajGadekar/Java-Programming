/*
Program 7 : Take N as input print whether its perfect of not
 */

class perfect{

        public static void main(String[] args){

                int N = 8;
		int sum = 0;

                for(int i = 1;i < N;i++){

                        if(N % i == 0){
				
				sum = sum + i;
			}
                }
		if(sum == N){
			
			System.out.println(N + " is perfect number");
		}else{
			
			System.out.println(N + " is not perfect Number");
		}
        }
}

