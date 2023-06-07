class Demo {

	void fun(int x,float y) {
		
		System.out.println("Int-Float Parameter");
	}
	void fun(float x,int y) {
		
		System.out.println("Float-Int Parameter");
	}
}
class Client {
	
	public static void main(String[] args) {

		Demo obj = new Demo();
		obj.fun(10,10);
	}
}

/*
 O/P :
  Error: reference to fun is ambiguous
		obj.fun(10,10);
		   ^
  both method fun(int,float) in Demo and method fun(float,int) in Demo match

 */
