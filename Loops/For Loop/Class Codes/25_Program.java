/*
 
 A  B  C  D
 A  B  C
 A  B
 A

 */

class pattern{

	public static void main(String[] args){
		
		char ch = 'A';
		int count = 4;
	
		for(int i = 1; i <= 4; i++){
			
			System.out.print(ch + "  ");
			ch++;

			if(i == count){
				i = 0;
				count--;
				System.out.println();
				ch = 'A';
			}
			if(count == 0){
				break;
			}
		}
	}
}
