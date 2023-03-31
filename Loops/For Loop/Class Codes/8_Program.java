/*
 Program 8 : Take N as input print whether its Armstrong or Not
 */

class armStrong{

        public static void main(String[] args){

                int N = 164;
		int sum = 0,count = 0;
                for(int i = N;i != 0;i /= 10){

                        count++;
		}

		for(int i =  N; i != 0;i /= 10){
			
			int rem = i % 10;
			int mul = 1;
			for(int j = 1; j <= count; j++){
				
				mul = mul * rem;
			}

			sum = sum + mul;
		}
		if(sum == N){
			
			System.out.println(N + " is a Armstrong Number");
		}else{

			System.out.println(N + " is a Not Armstrong Number");
		}
        }
}

