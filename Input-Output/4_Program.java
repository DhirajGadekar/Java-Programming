import java.io.*;

class playerInfo{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the player name : ");
		String pname = br.readLine();
		
		System.out.println("Enter the player JerNo : ");
		int JerNo = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the player Average : ");
		float avg = Float.parseFloat(br.readLine());

		System.out.println("Name : " + pname);
		System.out.println("JerNo : " + JerNo);
		System.out.println("Average : " + avg);
	}
}
