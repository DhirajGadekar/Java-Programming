import java.util.*;

class PrintException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Integer Value : ");
		int num = 0;

		try {
			
			num = sc.nextInt();
		} catch(InputMismatchException obj) {
			
			System.out.print("Exception in Thread " + "\"" +Thread.currentThread().getName() + "\"" + " ");
			obj.printStackTrace();
		}
	}
}	
