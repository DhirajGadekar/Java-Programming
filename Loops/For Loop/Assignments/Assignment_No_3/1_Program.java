/*
 Program 1 : write a program to print the following pattern
	C2W1 C2W2 C2W3
	C2W1 C2W2 C2W3
	C2W1 C2W2 C2W3
 */

class pattern{

	public static void main(String[] args){
	
		for(int i = 1; i <= 3; i++){
			
			for(int j = 1 ; j <= 3; j++){
				
				System.out.print("C2W" + j + " ");
			}
			System.out.println();
		}
	}
}
