//Program 6 : Write a program to print the sum of all sum even and multiplication of odd number

class sumMul{

	public static void main(String[] args){
		
		int sum = 0,mul = 1,i = 1;

		while(i <= 10){
			
			if(i % 2 == 0){
				sum = sum + i;
			}else{
				mul = mul * i;
			}
			i++;
		}
		System.out.println("Sum of all even number : " + sum);
		System.out.println("Mul of all odd number : " + mul);
	}
}
