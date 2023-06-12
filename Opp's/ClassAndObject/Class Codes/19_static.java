class Demo {

        static {

                System.out.println("In Static Block 1");
        }

}

class Client {

        static {

                System.out.println("In Static Block 2");
        }

        public static void main(String[] args) {

                System.out.println("In Client Main");
		Demo obj = new Demo();
        }
}

