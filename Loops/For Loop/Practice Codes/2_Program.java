//Program 2 : HCF(Highest Commen Factor) of two numbers


import java.util.Scanner;

class hcf{
	
	public static void main(String[] args){
		
		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter the 1st Num : ");
		int num1 = Obj.nextInt();
	
		System.out.println("Enter the 2nd Num : ");
		int num2 = Obj.nextInt();
		
		int com = 0;
		for(int i = 1;i <= num1 || i <= num2; i++){
			
			if(num1 % i == 0 && num2 % i == 0){
				
				com = i; 
			}
		}
		System.out.println(com);

	}
}
