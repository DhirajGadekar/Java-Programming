class Parent {

        int x = 10;
        Parent() {

                System.out.println("Parent X : " + x);
        }
}
class Child extends Parent {

        int x = 20;
        Child() {
                super();
                System.out.println("Parent X : " + super.x);
        }
        void access() {

                System.out.println("Child X : " + x);
                System.out.println("Parent X : " + super.x);
        }
}

class Client {

        public static void main(String[] args) {

                Child obj = new Child();
		obj.access();
        }
}
