//Nested Switch Example : Login

import java.util.Scanner;

class OOT_Platform{

        public static void main(String[] args){

                Scanner obj = new Scanner(System.in);

                System.out.print("1.LogIn\n2.SignUp\n");
                System.out.print("Enter the Your Choice : ");
                int choice = obj.nextInt();

                switch(choice){

                        case 1:{

                                System.out.print("1.UserName\n2.Password\n");
                                System.out.print("Enter your Choice : ");;
                                int choice1 = obj.nextInt();
                                switch(choice1){
                                        case 1:
                                                System.out.println("Successfully Entered");
                                                break;
                                        case 2:
                                                System.out.println("Succesfully Entered");
                                                break;
                                        default:
                                                System.out.println("Wrong Username or Password");
                                                break;
                                }
                        }
                        break;
                        case 2:{
                                
                                System.out.print("1.UserName\n2.Password\n");
                                System.out.print("Enter your Choice : ");;
                                int choice1 = obj.nextInt();
                                switch(choice1){
                                        case 1:
                                                System.out.println("Successfully Created UserName");
                                                break;
                                        case 2:
                                                System.out.println("Succesfully Created Password");
                                                break;
                                        default:
                                                System.out.println("Wrong Username or Password");
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

