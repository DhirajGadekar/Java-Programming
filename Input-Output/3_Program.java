
import java.io.*;

class playerInfo{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Batsman Name : ");
		String Pname1 = br.readLine();
		
		System.out.println("Enter the Bowler Name : ");
		String Pname2 = br.readLine();

		System.out.println("Batsman Name : " + Pname1);
		System.out.println("Bowler Name : " + Pname2);
	}
}
