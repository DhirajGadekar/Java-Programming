class StringDemo{

        public static void main(String[] args){

                String str1 = "Dhiraj";
                String str2 = new String("Dhiraj");
                String str3 = "Dhiraj";
                String str4 = new String("Dhiraj");

                System.out.println(str1.hashCode());
                System.out.println(str2.hashCode());
                System.out.println(str3.hashCode());
                System.out.println(str4.hashCode());
        }
}
