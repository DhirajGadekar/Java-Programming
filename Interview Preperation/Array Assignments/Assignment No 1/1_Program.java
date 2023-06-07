/*
Program 1 : Write a program to create an array of 5 integer elements.
	    And print all 5 elements from an array (take hardcoded values in the array)
	
	Output :
		1
		2
		3
		4
		5
 */

class ArrayAssignment {
	
	void printArray(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {

		ArrayAssignment obj = new ArrayAssignment();

		int arr[] = {1,2,3,4,5};
		obj.printArray(arr);
	}

}
