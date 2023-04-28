//Command Line Arguments : 

class CommandLine{
	
	public  static void main(String[] args) {
		
		String[] str = {"Dhiraj", "Ganesh","Manish","Rohan","Aditya","Ajinkya","Omkar"};

		for(String i : str){
			
			System.out.println(i);
		}

		for(int i = 0; i < args.length; i++){

			System.out.println(args[i]);
		}
	}
}
