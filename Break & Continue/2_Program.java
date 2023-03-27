
class BreakDemo{
	
	public static void main(String[] args){
		
		int N = 40;
		for(int i = 1; i <= N;i++){
			
			if(i % 3 == 0){
				break;
			}
			System.out.println(i);

		}
	}
}
