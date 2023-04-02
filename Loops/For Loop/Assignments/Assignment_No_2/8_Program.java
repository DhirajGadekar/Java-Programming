/*
 Program 8 : write a program to print the following pattern
	d d d d
	c c c c
	b b b b
	a a a a

 */

class pattern {

        public static void main(String[] args){
		
		char ch = 96 + 4;
                for(int i = 1; i <= 4; i++){
			
                        for(int j = 1; j <= 4; j++){
				
				System.out.print(ch + " ");
                        }
			ch--;
                        System.out.println();

                }
        }
}
