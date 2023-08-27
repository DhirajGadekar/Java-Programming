interface Core2Web {
	
	String lang(int numCourse);
}

class Main {
	
	public static void main(String[] args) {
		
		Core2Web c2w = (numCourse) -> {
			
			return "BootCamp/Java/Flutter/OS" + " : " + numCourse; 
		};

		System.out.println(c2w.lang(4));
	}
}
