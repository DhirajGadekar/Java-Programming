/*
 
 *  *  *  *
 *  *  *
 *  *
 *
 
 */

class pattern{

	public static void main(String[] args){
		
		int count = 4;

		for(int i = 1; i <= 4; i++){
			
			System.out.print("*  ");

			if(count == i){
				i = 0;
				count--;
				System.out.println();
			}
			if(count  == 0){
				
				break;
			}

		}	
	}
}
