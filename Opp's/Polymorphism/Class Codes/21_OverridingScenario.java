class Parent {

        void fun() {

                System.out.println("Parent Fun");
        }
}
class Child extends Parent {

        private void fun() {

                System.out.println("Child Fun");
        }
}
class Client {

        public static void main(String[] args) {

                Parent obj = new Parent();
                obj.fun();
        }
}

/*
  Error: fun() in Child cannot override fun() in Parent
        private void fun() {
                     ^
  attempting to assign weaker access privileges; was package
 */
