//Integer Cache : 

class integerCache{
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		Integer z = 10;
		int p = 20;
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(p));
	}
}
