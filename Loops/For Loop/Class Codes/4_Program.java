/*
Program 4 : Take N as input print factors 
 */

class factors{

        public static void main(String[] args){

                int N = 6;
		
		System.out.print("Factors of "+ N + " is ");
                for(int i = 1;i <= N;i++){

                        if(N % i == 0){
				
				System.out.print(i+" ");
			}
                }
		System.out.print("\n");
        }
}

