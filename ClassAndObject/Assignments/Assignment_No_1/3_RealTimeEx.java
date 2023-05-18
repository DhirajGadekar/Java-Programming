
class Gym {
	
	String clientName = "Dhiraj";
	int lockerNo = 12;
	static boolean gymEquipments = true;

	void clientInfo() {
				
		System.out.println("Name : " + clientName);
		System.out.println("Locker No : " + lockerNo);
		System.out.println("Equip : " +  gymEquipments);
	}
}

class Client {
	
	public static void main(String[] args) {
		
		Gym client1 = new Gym();
		Gym client2 = new Gym();

		client1.clientInfo();
		client2.clientInfo();

		client2.clientName = "Ganesh";
		client2.lockerNo = 20;
		client2.gymEquipments = false;

		System.out.println("---------------------------------------");

		client1.clientInfo();
		client2.clientInfo();
	}
}
