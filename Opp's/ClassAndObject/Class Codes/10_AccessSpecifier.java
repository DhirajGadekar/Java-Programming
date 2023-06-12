class Core2Web {

        int noOfCource = 6;
        private String favCource = "Java";

        void disp() {

                System.out.println(noOfCource);
                System.out.println(favCource);
        }
}

class User {

        public static void main(String[] args) {

                Core2Web obj = new Core2Web();

                obj.disp();
                System.out.println(obj.noOfCource);
                System.out.println(obj.favCource);
        }
}

/*
 O/P : 
 Error: favCource has private access in Core2Web
                System.out.println(obj.favCource);
				        ^
 */
