interface Demo1 {

        default void fun() {

                System.out.println("In fun-Demo1");
        }
}
interface Demo2 {

        default void fun() {

                System.out.println("In Fun-Demo2");
        }
}
class DemoChild implements Demo1,Demo2 {

	public void fun() {

		System.out.println("In Fun DemoChild");
	}
}
class Client {

        public static void main(String[] args) {

                Demo1 obj = new DemoChild();
                obj.fun();
        }
}
