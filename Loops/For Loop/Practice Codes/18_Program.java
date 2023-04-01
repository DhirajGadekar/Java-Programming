import java.util.Scanner;

class pattern{

        public static void main(String[] args){
                Scanner obj = new Scanner(System.in);
                System.out.print("Enter the Number of Rows : ");
                int row = obj.nextInt();
		
		int col1 = 1;
		int col2 = 1;
                for(int i = 1; i <= row * 2 - 1; i++){

                        if(i <= row){
				
				col1 = row - i;
				col2 = i + (i - 1);
			}else{
				col1 = i - row;
				col2 = 2 * row - 2 * col1 - 1; 
			}
			for(int sp = 1; sp <= col1; sp++){
				
				System.out.print("   ");
			}
			for(int j = 1; j <= col2; j++){
				
				System.out.print("*  ");
			}
			System.out.println();
                }
        }
}

