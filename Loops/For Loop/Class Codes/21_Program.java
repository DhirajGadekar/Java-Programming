/*
 
 1 
 4   9
 16  25  36
 49  64  81  100

 */

class pattern{
	
	public static void main(String[] args){

		int count = 1;
		int num  = 1;
		for(int i = 1; i <= 4; i++){
			
			System.out.print((num * num) + "  ");
			num++;
			if(i == count){
				i = 0;
				count++;
				System.out.println();
			}
			if(count - 1 == 4){

				break;
			}
		}
	}
}
