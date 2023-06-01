class Parent {

        Parent() {

                System.out.println("In Parent Constructor");
        }
	void parentProperty() {
		
		System.out.println("Flat, Car, Gold");
	}
}
class Child extends Parent {

        Child() {

                System.out.println("In Child Constructor");
        }
}

class Main {

        public static void main(String[] args) {

                Parent obj = new Child();
                System.out.println(obj);
        }
}


