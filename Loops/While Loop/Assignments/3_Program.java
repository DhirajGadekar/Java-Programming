// Program 3 : Count digit in number

class countDigit{

	public static void main(String[] args){
		
		int num = 293847781;
		int count = 0;
		while(num != 0){
			
			count++;
			num = num / 10;
		}
		System.out.println("Count is " + count);

	}
}
