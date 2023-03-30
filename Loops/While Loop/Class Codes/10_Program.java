//Program 10:
// -Given an integer N
// -Print its in reverse order
// -Input  : 123
// -Output : 321

class revreseOrder{

	public static void main(String[] args){
		
		int num = 1234,sum = 0;

		while(num != 0){
			
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		System.out.println("Reverse Number : "+ sum);
	}
}
