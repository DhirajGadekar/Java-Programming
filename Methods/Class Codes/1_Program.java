/*
 Program 1 : 
 */

class Methods_Demo{
	
	int x = 10;
	static int y = 20;
	void fun(){
		
		System.out.println("In Fun Method");
	}

	static void gun(){
		
		System.out.println("In Gun Method");
	}
	public static void main(String[] args){
		
		System.out.println("In Main Method");

		Methods_Demo obj = new Methods_Demo();

		gun();
		obj.fun();

		System.out.println(obj.x);
		System.out.println(y);
		System.out.println("End Main Method");
	}
}
