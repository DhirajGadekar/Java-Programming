interface A {
	
	int x = 10;
}
interface B {

	int x = 20;
}
class Child implements A,B {
	
	void fun() {
		
		System.out.println(x); //Error
	}
}
class Client {

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.fun();
	}
}

/*
  Error: reference to x is ambiguous
		System.out.println(x);
		                   ^
  both variable x in A and variable x in B match


 Solution :

	Access variable using interfase reference 

	System.out.println(A.x);
	or
	System.out.println(B.x);
 */
