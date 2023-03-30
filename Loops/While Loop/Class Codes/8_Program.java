// Program 8:
// - Given an integer N
// - Print multiplication of all its digit
// - Input  : 125
// - Output :10

class mulDigit{

        public static void main(String[] args){

                int num = 119;
		int mul = 1;

                	
		if(num > 0 || num < 0){
			while(num != 0){

                      		mul = (num % 10) * mul;
                        	num /= 10;
                	}
			System.out.println("Multiplication of all digit is " + mul);
		}else{

			System.out.println("Multiplication of all digit is 0");
		}
        }
}

