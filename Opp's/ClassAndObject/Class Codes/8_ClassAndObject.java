class MagD {

	int items = 10;
        String product = "Frices";

        void menu() {

                String menu1 = "Veg";
                String menu2 = "Non-Veg";
               
                System.out.println(items);
                System.out.println(product);
        }
}

class User {

        public static void main(String[] args) {

                MagD obj = new MagD();

                obj.menu();
        }
}

