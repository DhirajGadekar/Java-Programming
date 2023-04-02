/*
 Program 10 : write a program to print the following pattern
	1 2 3 4
	2 3 4 5
	3 4 5 6
	4 5 6 7

 */

class pattern {
	
	public static void main(String[] args){
		
		for(int i = 1; i <= 4; i++){
			
			int num = i;
			for(int j = 1; j <= 4; j++){
				
				System.out.print(num + " ");
				num++;
			}
			System.out.println();

		}
	}
}
