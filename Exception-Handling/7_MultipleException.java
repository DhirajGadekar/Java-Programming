import java.util.*;

class MultipleException {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Integer Value : ");
		int num = 0;

		try {
			
			num = sc.nextInt();
			System.out.println(10/num);
		} catch(InputMismatchException | ArithmeticException obj) {
			
			System.out.println("Exception Handled");
		}
	}
}
