// Program 7:
// - Given an integer N
// - Print sum all its digit
// - Input  : 6547
// - Output : 22

class sumDigit{

        public static void main(String[] args){

                int num = 6547;
		int sum = 0;
                while(num != 0){

                        sum = num % 10 + sum;
                        num /= 10;
                }
		System.out.println("Addition of all digit is "+ sum);
        }
}

