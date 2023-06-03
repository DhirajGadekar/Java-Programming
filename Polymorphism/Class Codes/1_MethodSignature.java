
class Demo {

	void fun(int x) {

		System.out.println(x);
	}

	int fun(int y) {

		System.out.println(y);
	}
}	
 
/*
 O/P :
 	Error: method fun(int) is already defined in class Demo
		int fun(int y) {
		    ^
 */
