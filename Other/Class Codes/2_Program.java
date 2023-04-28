// 

class ArrayDemo{
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};

		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));

		int x = 20;
		int y = 30;
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));

		x = 60;
		y = 70;

		arr[1] = x;
		arr[2] = y;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
	}
}
