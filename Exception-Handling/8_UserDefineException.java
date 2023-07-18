import java.io.*;

class DataUnderFlowException extends RuntimeException{
	
	DataUnderFlowException(String msg) {
		
		super(msg);
	}
}

class DataOverFlowException extends RuntimeException{
	
	DataOverFlowException(String msg) {
		
		super(msg);
	}
}

class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];

		System.out.println("Enter Integer value in Array : ");
		System.out.println("Note: 0 < element < 100");
		for(int i = 0; i < arr.length; i++) {
			
			int data = 0;
			try {

				data = Integer.parseInt(br.readLine());
			} catch(NumberFormatException nfe) {
				
				System.out.println("Enter Integer Value : ");
				data = Integer.parseInt(br.readLine());
			}

			if(data < 0) {
				
				try {

					throw new DataUnderFlowException("Data is less than 0");
				} catch(DataUnderFlowException duf) {
					
					System.out.println(duf.getMessage());
					i--;
				}
			}
			if(data > 100) {
				
				try {

					throw new DataOverFlowException("Data is greater than 100");
				} catch(DataOverFlowException duf) {
					
					System.out.println(duf.getMessage());
					i--;
				}
			}
			arr[i] = data;
		}
		
		System.out.println("Array Elements : ");

		for(int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
