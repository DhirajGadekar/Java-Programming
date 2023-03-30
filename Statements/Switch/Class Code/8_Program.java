//Nested Switch Example : Hotel platform

import java.util.Scanner;

class OOT_Platform{

        public static void main(String[] args){

                Scanner obj = new Scanner(System.in);
		char ch = 1;
		do{
		System.out.print("\n*** PARADISE BIRYANI HOUSE ***\n\n");

		System.out.print("1.BIRYANI \n");
		System.out.print("2.STARTERS \n");
		System.out.print("3.KEBABS \n");
        	System.out.print("4.CURRIES \n");
        	System.out.print("5.INDIAN BREADS \n\n");
		System.out.print("Enter your Choice : ");
		int choice = obj.nextInt();

		switch(choice){

			case 1:
				System.out.print("\n\n*** BIRYANI ***\n\n");

				System.out.print("1.NON-VEG BIRYANI \n");
				System.out.print("2.VEG BIRYANI \n\n");
	
				System.out.print("Enter Your Choice : ");
				int biryani = obj.nextInt();

				switch(biryani){

					case 1:
					
						System.out.print("\n      NAME                                PRICE\n");

						System.out.print("\n1.CHICKEN BIRYANI                  -      150.Rs\n");
                                       	 	System.out.print("2.MUTTON BIRYANI                   -      180.Rs\n");
                   	                	System.out.print("3.EGG BIRYANI                      -      120.Rs\n");
             		 	        	System.out.print("4.FAMILY PACK CHICKEN BIRYANI      -      500.Rs\n");
                		        	System.out.print("5.FAMILY PACK MUTTON BIRYANI       -      650.Rs\n");
                		        	System.out.print("6.SPECIAL CKICKEN BIRYANI          -      190.Rs\n");
 		                        	System.out.print("7.SPECIAL MUTTON BIRYANI           -      250.Rs\n\n");

				        	System.out.print("Enter your choice : ");
						int nvbiryani = obj.nextInt();

						if(nvbiryani == 1){
                             				System.out.print("\nYour order for 'CHICKEN BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
						}
						else if(nvbiryani == 2){
                                                	System.out.print("Your order for 'MUTTON BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	}
						else if(nvbiryani == 3){
                                                	System.out.print("Your order for 'EGG BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	}
						else if(nvbiryani == 4){
                                                	System.out.print("Your order for 'FAMILY PACK CHICKEN BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	}
						else if(nvbiryani == 5){
                                                	System.out.print("Your order for 'FAMILY PACK MUTTON BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	}
						else if(nvbiryani == 6){
                                                	System.out.print("Your order for 'SPECIAL CHICKEN BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	}
						else if(nvbiryani == 7){
                                                	System.out.print("Your order for 'SPECIAL MUTTON BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	}
						else{
                                                	System.out.print("You Enter Wrong Choice. \n");
                                        	}

						break;

					case 2:
						
						System.out.print("\n    NAME                         PRICE\n\n");

             	                        	System.out.print("1.VEG. BIRYANI             -     150.Rs\n");
                		        	System.out.print("2.VEG. FAMILY BIRYANI      -     450.Rs \n");
                		        	System.out.print("2.VEG. SPECIAL BIRYANI     -     180.Rs\n\n");

						System.out.print("Enter Your Choice : ");
						int vbiryani = obj.nextInt();

						if(vbiryani == 1){
                                                	System.out.print("\nYour order for 'VEG. BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	}
                                        	else if(vbiryani == 2){
                                                	System.out.print("\nYour order for 'VEG.FAMILY BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You ! \n");
                                        	}
                                        	else if(vbiryani == 3){
                                                	System.out.print("\nYour order for 'VEG SPECIAL BIRYANI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	}
                                        	else{
                                                	System.out.print("You Enter Wrong Choice. \n");
                                        	}
						break;
				}
				break;

			case 2:

				System.out.print("\n\n*** STARTERS ***\n\n");

				System.out.print("CATEGORY          NAME                     PRICE\n\n");
				System.out.print("NON-VEG      1.CHICKEN CHILLI        -     164.Rs\n");
				System.out.print("             2.CHICHEN 65            -     180.Rs \n");
				System.out.print("             3.PEPPER CHICHEN        -     160.Rs \n");

				System.out.print("VEG          4.PANEER 65             -     164.Rs\n");
				System.out.print("             5.MANCHURIAN            -     145.Rs \n\n");

				System.out.print("Enter Your Choice : ");
				int starters = obj.nextInt();

				switch(starters){

					case 1:
						System.out.print("Your order for 'CHICKEN CHICKEN' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You ! \n");
						break;

					case 2:
						System.out.print("Your order for 'CHICKEN 65' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
						break;

					case 3:
                                        	System.out.print("Your order for 'PEPPER CHICKEN' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

					case 4:
                                        	System.out.print("Your order for 'PANEER 65' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

					case 5:
                                        	System.out.print("Your order for 'VEG. MANCHURIAN' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

					default:
						System.out.print("You Enter Wrong Choice.\n");

				}
				break;

			case 3:
                        	
                        	System.out.print("\n\n*** KEBABS ***\n\n");

                        	System.out.print("       NAME                           PRICE\n\n");
                        	System.out.print(" 1.CHICKEN TIKKA KEBAB          -     240.Rs\n");
                        	System.out.print(" 2.TANDOORI CHICKEN {HALF}      -     240.Rs \n");
                        	System.out.print(" 3.TANDOORI CHICKEN {FULL}      -     360.Rs \n");
                        	System.out.print(" 4.CHICKEN GARLIC KEBAB         -     240.Rs\n\n");

                        	System.out.print("Enter Your Choice : ");
                        	int kebab = obj.nextInt();

                        	switch(kebab){

                                	case 1:
                                        	System.out.print("Your order for 'CHICKEN TIKKA KEBAB' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You ! \n");
                                        	break;

                                	case 2:
                                        	System.out.print("Your order for 'TANDOORI CHICKEN {HALF}' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

                                	case 3:
                                        	System.out.print("Your order for 'TANDOORI CHICKEN {FULL}' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

					case 4:
                                        	System.out.print("Your order for 'CHICKEN GARLIC KABAB' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

                                	default:
                                        	System.out.print("You Enter Wrong Choice.\n");
						break;

                        	}
                        	break;

			case 4:
                        	
                        	System.out.print("\n\n*** CURRIES ***\n\n");

                        	System.out.print("                   NAME                           PRICE\n\n");
                        	System.out.print("NON-VEG      1.BUTTER CHICKEN BONLESS       -     240.Rs\n");
                        	System.out.print("VEG          2.NIZAMI HANDI                 -     240.Rs \n\n");

                        	System.out.print("Enter Your Choice : ");
                        	int curries = obj.nextInt();

                        	switch(curries){
	
                                	case 1:
                                        	System.out.print("Your order for 'BUTTER CHECKEN BONLESS' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

                                	case 2:
                                        	System.out.print("Your order for 'NIZAMI HANDI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

                                	default:
                                        	System.out.print("You Enter Wrong Choice.\n");
						break;
                        	}
                        	break;

			case 5:
				
                        	System.out.print("\n\n*** INDIAN BREADS ***\n\n");

                        	System.out.print("       NAME                   PRICE\n");
				System.out.print(" 1.ROTI                 -     24.Rs \n");
                        	System.out.print(" 2.MAKKI ROTI           -     36.Rs \n");
                        	System.out.print(" 3.TANDOORI ROTI        -     30.Rs\n");
                        	System.out.print(" 4.RUMALI RO            -     32.Rs \n\n");

                        	System.out.print("Enter Your Choice : ");
                        	int roti = obj.nextInt();

                        	switch(roti){

					case 1:
                                        	System.out.print("Your order for 'ROTI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                       	 	break;

                                	case 2:
                                        	System.out.print("Your order for 'MAKKI ROTI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

					case 3:
                                        	System.out.print("Your order for 'TANDOORI ROT' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

                                	case 4:
                                        	System.out.print("Your order for 'RUMALI ROTI' has been successful. \nPlease wait,Your order will be placed on your table in just 10 minutes.\nThank You !\n");
                                        	break;

                                	default:
                                        	System.out.print("You Enter Wrong Choice.\n");
                        	}
                       	 	break;

			default:
                		System.out.print("You Enter Wrong Choice.\n");
				break;
		}
		System.out.print("If you want countinue press [Y | y] else press [N | n] :");
		ch = obj.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
