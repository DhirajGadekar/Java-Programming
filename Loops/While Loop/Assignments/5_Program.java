//Program 5: Write a program to square of even digit of given number

class evenNumSqr{
	
	public static void main(String[] args){
		
		int num = 9345874;

		while(num != 0){
			
			int rem = num % 10;

			if(rem % 2 == 0){
				System.out.println(rem * rem);
			}
			num = num / 10;
		}
		
	}
}
