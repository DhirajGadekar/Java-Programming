
import java.io.*;
import arithoper.Addition;
import arithoper.Substraction;
import arithoper.Multiplication;
import arithoper.Division;

class Client {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch = ' ';
		do {
			System.out.println("1.Addition");	
			System.out.println("2.Substraction");	
			System.out.println("3.Multiplication");	
			System.out.println("4.Division");

			System.out.println("Enter Your Choice : ");
			int choice = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Two Values : ");
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());
			
			switch(choice) {
				
				case 1:
				{
					Addition obj = new Addition(num1, num2);
					System.out.println("Addition : " + obj.add());		
				}
				break;
				
				case 2:
				{
					Substraction obj = new Substraction(num1, num2);
					System.out.println("Substraction : " + obj.sub());
				}
				break;

				case 3:
				{
					Multiplication obj = new Multiplication(num1, num2);
					System.out.println("Multiplication : "+ obj.mul());
				}
				break;

				case 4:
				{
					Division obj = new Division(num1, num2);
					System.out.println("Division : " + obj.div());
				}	
				break;

				default:
					System.out.println("Wrong Choice");

			}	
			
			System.out.println("Do you want Continue?");
			ch = (char)br.read();
			br.skip(1);
		} while(ch == 'y' || ch == 'Y');
	}
}
