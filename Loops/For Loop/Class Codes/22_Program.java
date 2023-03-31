/*
 1
 4   3
 16  5  36
 49  8  81  10
 */

class pattern{
	
	public static void main(String[] args){
		
		int count = 1;
		int num = 1;

		for(int i = 1; i <= 4; i++ ){
			
			if(i % 2 == 1){
				System.out.print(num * num + "  ");
			}else{

				System.out.print(num  + "  ");
			}
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
