//Program 5 : Write a program to find all the perfect numbers between two given numbers.

import java.util.Scanner;

class perfectNum{
	
	public static void main(String[] args){
		
		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter the First Number : ");
		int num1 = Obj.nextInt();

		System.out.println("Enter the Sec Number : ");
		int num2 = Obj.nextInt();

		System.out.println("Perfect Numbers are : ");
		
		if(num2 >= num1){
			while(num1 <= num2){
			
				int i = 1,sum = 0;
				while(i < num1){
				
					if(num1 % i == 0){
					
						sum += i;
					}
					i++;
				}
				if(num1 == sum){
				
					System.out.println(num1);
				}
			
				num1++;
			}
		}else{

			while(num2 <= num1){

                        	int i = 1,sum = 0;
                        	while(i < num2){

                                	if(num2 % i == 0){

                                        	sum += i;
                                	}
                                	i++;
                        	}
                        	if(num2 == sum){

                                	System.out.println(num2);
                        	}

                        	num2++;
                	}
		}

	}
}
