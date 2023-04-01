// Program 1 : LCM (Latest Commom Multiple) of two numbe


class lcm{
	
	public static void main(String[] args){

		int num1 = 12, num2 = 18;
		int com = 1;

		for(int i = 1; i <= num1 || i <= num2; i++){
			
			if(num1 % i == 0 && num2 % i == 0){
				
				com = i;
			}
		
		}
		int lcm = (num1 * num2) / com;
		System.out.println("LCM of "+ num1 + " and "+ num2 + " is " + lcm);
	}
}
