interface Demo {

        static void fun() {

                System.out.println("In fun Demo");
        }
}
class DemoChild implements Demo {
	
	void fun() {
		
		System.out.println("In Fun DemoChild");
	}
}
class Client {

        public static void main(String[] args) {

                Demo obj = new DemoChild();
                obj.fun();
        }
}

/*
  Error: illegal static interface method call
                obj.fun();
                       ^
  the receiver expression should be replaced with the type qualifier 'Demo'
 */
