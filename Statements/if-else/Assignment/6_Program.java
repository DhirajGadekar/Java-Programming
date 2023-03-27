//Program 6 : Write a program to find a maximum between three numbers.

class MaxBetThree{

        public static void main(String[] args){

                int num1 = 5;
                int num2 = 5;
                int num3 = 2;

                if(num1 > num2 && num1 > num3){
                        
			System.out.println(num1 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                }else if(num2 > num3 && num2 > num1){

                        System.out.println(num2 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                }else if(num3 > num2 && num3 > num1){

                        System.out.println(num3 +" is the maximum between " + num1 +","+num2 + " and "+num3);
		}else if(num1 == num2 && num3 > num1){

                        System.out.println(num3 +" is the maximum between " + num1 +","+num2 + " and "+num3);
		}else if(num2 == num3 && num1 > num2){

                        System.out.println(num1 +" is the maximum between " + num1 +","+num2 + " and "+num3);
		}else if(num1 == num3 && num2 > num1){

                        System.out.println(num2 +" is the maximum between " + num1 +","+num2 + " and "+num3);
		}else if(num1 == num2 && num1 > num3){

                        System.out.println(num1 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                }else if(num2 == num3 && num2 > num1){

                        System.out.println(num2 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                }else if(num1 == num3 && num3 > num2){

                        System.out.println(num3 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                }else{

                        System.out.println("All Numbers Are Equal");
		}
	
	}
}
