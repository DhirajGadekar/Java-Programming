// Problem 9 :
// - Given an integer N
// - Print perfect square till N
// - perfect Square : an integer whose square root is a integer
// - Input  : 30
// - Output : 1 4 9 16 25 


class perfectSquare{

        public static void main(String[] args){

                int num = 50, i = 1;
		
                while(i * i <= num){

                        System.out.println(i * i);
                        i++;
                }
        }
}

