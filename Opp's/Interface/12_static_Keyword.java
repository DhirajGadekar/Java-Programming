interface Demo {

        static void fun() {

                System.out.println("In fun Demo");
        }
}
class DemoChild implements Demo {

        void fun() {

                System.out.println("In Fun DemoChild");
		Demo.fun();
        }
}
class Client {

        public static void main(String[] args) {

                DemoChild obj = new DemoChild();
                obj.fun();
        }
}
