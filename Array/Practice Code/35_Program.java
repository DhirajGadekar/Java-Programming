import java.io.*;

class TwoDArray{

        static void additionRow(int arr[][]){

		System.out.println("Addition of rows : ");
                for(int i = 0; i < arr.length; i++){
                	int sum = 0;
                        for(int j = 0; j < arr[i].length; j++){
				                        
				sum = sum + arr[i][j]; 
                        }
			System.out.println("Row  " + i + " : " +sum);
                }
        }

        public static void main(String[] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the length of Row : ");
                int row = Integer.parseInt(br.readLine());

                System.out.println("Enter the length of Col : ");
                int col = Integer.parseInt(br.readLine());

                int arr[][] = new int[row][col];

                System.out.println("Enter the Array elements : ");
                for(int i = 0; i < row; i++){

                        for(int j = 0; j < col; j++){

                                arr[i][j] = Integer.parseInt(br.readLine());
                        }
                }

                additionRow(arr);
        }
}
