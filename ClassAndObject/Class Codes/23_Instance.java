class Instance {

        int x = 10;

        Instance() {

                System.out.println("In Instance Constructor");
        }

        {
                System.out.println("In Instance Block 1");
        }

}

class Main {

	Main() {
		
		System.out.println("In Main Constructor");
	}
	{
		
		System.out.println("In Instance Block 2");
	}
	public static void main(String[] args) {
		
		Instance obj1 = new Instance();
		Main obj2 = new Main(); 
	}
}
