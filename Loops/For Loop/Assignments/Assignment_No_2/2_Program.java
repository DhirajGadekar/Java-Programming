/*
 Program 2 : write a program to print the following pattern
	4 5 6 7
	4 5 6 7
	4 5 6 7
	4 5 6 7
 */

class pattern {

        public static void main(String[] args){

                for(int i = 1; i <= 4; i++){
			int num = 1;
                        for(int j = 1; j <= 4; j++){
				
				System.out.print(( num + 3) + " ");
				num++;
                        } 
                        System.out.println();

                }
        }
}
