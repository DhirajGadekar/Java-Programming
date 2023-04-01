//Program 10 : Write a program to print the product of the first 10 numbers.

class mulNum{

	public static void main(String[] args){
		
		int mul = 1;
		for(int i = 1; i <= 10; i++){
			
			mul *= i;
		}
		System.out.println(mul);
	}
}
