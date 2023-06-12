class Parent {

        Parent() {
		
		System.out.println(this);
                System.out.println("In Parent Constructor");
        }
}
class Child extends Parent {

        Child() {

		System.out.println(this);
                System.out.println("In Child Constructor");
        }
}

class Main {

        public static void main(String[] args) {

                Child obj = new Child();
		System.out.println(obj);
        }
}

