
class Dream11 {

	int noOfTeams = 3;
	static String Contests = "Mega";
	static int noOfPlayersEachTeam = 11;

	static void contestsInfo() {
		
		System.out.println("Type of Contest : " + Contests);
		System.out.println("1st Price 1 Crore");
	}

	void creatingTeam() {
	
		System.out.println("Team Successfully Created");
	}
}

class User {
	
	public static void main(String[] args) {

		Dream11 obj = new Dream11();

		obj.contestsInfo();
		obj.creatingTeam();
	}

}
