interface Demo {

        static void fun() {

                System.out.println("In fun Demo");
        }
}
class DemoChild implements Demo {
	
	
}
class Client {

        public static void main(String[] args) {

                //DemoChild obj = new DemoChild();
                Demo.fun();
        }
}
