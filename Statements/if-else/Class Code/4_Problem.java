// -Given temperature of person in fasenherite
// -print whether the person has high,low,normal temp;
// > 98.6     -> high
// 98.0 <= and <= 98.6
// < 98.0
   
class Person_temp{

        public static void main(String[] agrs){

                float temp = 98.3f;
         

                if(temp > 98.6f){

                        System.out.println("High");
                }else if(temp < 98.0f){

                        System.out.println("Low");
                }else{

                        System.out.println("Normal");
		}

        }
}
