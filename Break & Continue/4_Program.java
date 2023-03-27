class continueDemo{
        
        public static void main(String[] args){
        	
		int N = 50;
                for(int i = 1; i <= N;i++){
                
			if((i % 3 == 0 && i % 5 == 0) || i % 4 == 0){
				
				continue;
			}
			System.out.println(i);

                }
        }
} 
