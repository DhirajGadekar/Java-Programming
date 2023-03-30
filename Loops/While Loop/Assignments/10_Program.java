//Program 10 : Palindrome

class palindrome{
	
	public static void main(String[] args){
		
		int num = 12321;
		int sum = 0;
		int temp = num;
		while(num != 0){
			
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num /= 10;
		}	
		if(temp == sum){
			System.out.println("Number is palindrome");
		}else{

			System.out.println("Number is Not palindrome");
		}
	}
}
