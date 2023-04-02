/*
 Program 3 : write a program to print the following pattern
	14 14 14 14
	15 15 15 15
	16 16 16 16
	17 17 17 17
 */

class pattern {

        public static void main(String[] args){
		
		int num = 13;
                for(int i = 1; i <= 4; i++){

                        for(int j = 1; j <= 4; j++){
				
				System.out.print( (i + num ) + " ");
                        }
                        System.out.println();

                }
        }
}
