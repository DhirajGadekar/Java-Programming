/*
Program 5 : Take N as input print factors sum
 */

class PrintN{

        public static void main(String[] args){

                int N = 8;
		int sum = 0;
                for(int i = 1;i <= N;i++){

                        if(N % i == 0){
				
				sum = sum + i;
			}
                }
		System.out.println("Sum of all factors :" + sum);
        }
}

