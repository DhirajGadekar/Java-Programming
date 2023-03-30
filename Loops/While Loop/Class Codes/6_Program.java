// Program 6:
// - Given an integer N
// - Print all its digit
// - Input ; 6547
// - Output :7
//           4
//           5
//           6

class printDigit{

	public static void main(String[] args){
		
		int num = 6547;

		while(num != 0){
	
			System.out.println(num % 10);
			num /= 10;
		}
	}
}
