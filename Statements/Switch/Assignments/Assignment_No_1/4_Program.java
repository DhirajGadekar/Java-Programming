/*
 Program 4 : Take choice from user.Show this to user
	
 	What's your interest?
	  1.movies
	  2.Series
	Enter your choice 1 or 2 :
	   If user enters 1 :
	    	  Movie you wish to watch today
		  1.Founder	
		  2. Snowden
	   	  3.Jobs
		  4.Her
	          5.Social Network
	          6.Wall-E
	          7.AI

	Enter your choice :
	   If user enters 2 :
		Best series to watch
		1.Silicon valley
		2.Devs
		3.the IT crowd
		4.Mr Robot
	Print users choice
 */

import java.io.*;

class MoviesAndSeries {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("What's your interest?");
        	System.out.println("1. Movies");
        	System.out.println("2. Series");

        	System.out.print("Enter your choice 1 or 2: ");
        	int choice = Integer.parseInt(br.readLine());

        	switch (choice) {
            		case 1:
                		System.out.println("Movie to watch today");
                		System.out.println("1. Founder");
                		System.out.println("2. Snowden");
                		System.out.println("3. Jobs");
                		System.out.println("4. Her");
                		System.out.println("5. Social Network");
                		System.out.println("6. Wall-E");
                		System.out.println("7. AI");

                		System.out.println("Enter your choice: ");
                		int mChoice = Integer.parseInt(br.readLine());

                		System.out.println("Your Selected Moive : ");
                		switch (mChoice) {
                    			case 1:
                        			
						System.out.println("Founder");
                        			break;
                    			case 2:
                        			
						System.out.println("Snowden");
                        			break;
                    			case 3:
                        			
						System.out.println("Jobs");
                        			break;
                    			case 4:
                        			
						System.out.println("Her");
                        			break;
                    			case 5:
                        			
						System.out.println("Social Network");
                        			break;
                    			case 6:
                        			System.out.println("Wall-E");
                        			break;
                    			case 7:
                        			System.out.println("AI");
                        			break;
                    			default:
                        			System.out.println("Invalid choice!");
                        			break;
                		}
                		break;

            		case 2:
                		System.out.println("Best series to watch");
                		System.out.println("1. Silicon Valley");
                		System.out.println("2. Devs");
                		System.out.println("3. The IT Crowd");
                		System.out.println("4. Mr Robot");

                		System.out.println("Enter your choice: ");
                		int sChoice = Integer.parseInt(br.readLine());

                		System.out.println("Your Selected Series : ");
                		
				switch (sChoice) {
                    			case 1:
                        			
						System.out.println("Silicon Valley");
                        			break;
                    			case 2:
                        			System.out.println("Devs");
                        			break;
                    			
					case 3:
                        			System.out.println("The IT Crowd");
                        			break;
                    			case 4:
                        			System.out.println("Mr Robot");
                        			break;
                    			default:
                        			System.out.println("Invalid choice!");
                        			break;
                		}
                		break;

            		default:
                		System.out.println("Invalid choice!");
                		break;
		}
	}
}


