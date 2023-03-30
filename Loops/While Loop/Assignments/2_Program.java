//Program 2: Write a program to calulate the factorial of given number.

class Factorial{
	
	public static void main(String[] args){
	
		int num = 5;
		int mul = 1;
		while(num >= 1){
			
			mul = mul * num;
			num--;
		}
		System.out.println("Factorial is "+ mul);
	}
}
