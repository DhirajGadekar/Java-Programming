class Parent {

        static int x = 10;
        static {

                System.out.println(x);
        }
}
class Child extends Parent {

        static int x = 20;
        static {

                System.out.println(Parent.x);
        }
}

class Client {

        public static void main(String[] args) {

                Child obj = new Child();
        }
}

