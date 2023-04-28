//Passing array as an Argument :

class ArrayDemo{
	
	void fun(int arr[]) {
		
		for(int i : arr){
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		
		ArrayDemo obj = new ArrayDemo();
		int arr[] = {1,2,3,4,5,6};

		for(int i : arr) {

			System.out.print(i + " ");
		}
		System.out.println();
		obj.fun(arr);
	}
}
