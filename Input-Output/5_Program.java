
import java.io.*;

class BuildingInfo{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Name : ");
		String name = br.readLine();
		
		System.out.println("Enter the Wing : ");
		char wing = (char)br.read();
		br.skip(1);
		
		System.out.println("Enter the FlatNo : ");
		int flatNo = Integer.parseInt(br.readLine());

		System.out.println("Name : " + name);
		System.out.println("Wing : " + wing);
		System.out.println("flatNo : " + flatNo);
	}
}
