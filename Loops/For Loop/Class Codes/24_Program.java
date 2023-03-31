/*
 
   1  4  3  16
   5  36 7
   8  81
   10

 */

class pattern{

	public static void main(String[] args){
		
		int num = 1;
		int count = 4;

		for(int i = 1; i <= 4; i++){
			
			if(i %  2 == 0){
				
				System.out.print(num * num + "  ");
			}else{
				System.out.print(num + "  ");
			}
			num++;

			if(i == count){
				i = 0;
				count--;
				System.out.println();
			}
			if(count == 0){
				
				break;
			}

		}
	}
}
