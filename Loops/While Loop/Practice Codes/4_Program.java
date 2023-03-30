//Automorphic number : 

import java.util.Scanner;

class Automorphic{

	public static void main(String[] args){
		
		Scanner Obj = new Scanner(System.in);
		int num = Obj.nextInt();

		int temp = num,count = 0;

		while(num != 0){
			
			count++;
			num = num / 10;
		}

		int sqr = temp * temp;
		int result = 1;
		while(count > 0){
			
			result *= 10;
			count--;
		}
		int sqrRem = sqr % result;

		if(sqrRem == temp){
			System.out.println("Automorphic Number");
		}else{
			System.out.println("Not Automorphic Number");
		}
	}
}
