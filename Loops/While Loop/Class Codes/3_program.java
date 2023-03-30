//Program 3: Take an integer N as input 
//           Print odd integer from 1 t0 N using While loop


class oddIng{
	
	public static void main(String[] args){
		
		int i = 1;

		while(i <= 10){
			
			if(i % 2 == 1){
				System.out.println(i);
			}
			i++;
		}
	}
}
