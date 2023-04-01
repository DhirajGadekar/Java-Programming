//Program 14 : Fibonacii Series

import java.util.Scanner;

class fibonacii{
	
	public static void main(String[] args){
	
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = obj.nextInt();

		int a1 = 0, a2 = 1;

		for(int i = 1; i<= num; i++){
			
			System.out.println(a1);
			int sum = a1 + a2;
			a1 = a2;
			a2 = sum;
		}

	}
}
