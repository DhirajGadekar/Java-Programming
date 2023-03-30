//Nested Switch Example : OTT platform

import java.util.Scanner;

class OOT_Platform{
	
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("1.Netfix\n2.Prime Video\n");
		System.out.print("Enter the Your Choice : ");
		int choice = obj.nextInt();

		switch(choice){

			case 1:{
				
				System.out.print("1.Movie\n2.TV Shows\n");
				System.out.print("Enter your Choice : ");;
				int choice1 = obj.nextInt();
				switch(choice1){
					case 1:
						System.out.println("Hindi  Movies");
						break;
					case 2:
						System.out.println("Serials");
						break;
					default:
						System.out.println("Wrong Choice");
						break;
				}
			}
			break;
			case 2:{
				System.out.print("1.Movie\n2.TV Shows\n");
				System.out.print("Enter your Choice : ");;
				int choice1 = obj.nextInt();
				switch(choice1){
					case 1:
						System.out.println("Marathi Movies");
						break;
					case 2:
						System.out.println("News");
						break;
					default:
						System.out.println("Wrong Choice");
						break;
				}
	
			}
			break;

			default:
				System.out.println("Wrong Choice");
				break; 
		}
		System.out.println("Visit Again");
	}
	
}
