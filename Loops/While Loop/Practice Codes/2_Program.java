//Program 2 : Reverce Number.


import java.util.Scanner;

class ReverceNum{

	public static void main(String[] arg){
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = Obj.nextInt();
		int sum = 0;

		while(num != 0){
			
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}

		System.out.println("Reverce Number is "+ sum);


	}
}	
