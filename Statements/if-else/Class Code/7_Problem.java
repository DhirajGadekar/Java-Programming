// Electricity Bil Problem
// -Given an integer input A which represent units of electricity 
// consumed at type house
// calculate and print the bill

// unit <= 100 -> price per unit is 1
// unit > 100  -> price per unit is 2
 
class Electricity_Bill{

        public static void main(String[] agrs){

                int unit = 200;

                if(unit <= 100){

                        System.out.println(unit);
                }else{

                        System.out.println((unit - 100) * 2 + 100);

                }

        }
}
