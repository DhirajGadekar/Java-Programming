import java.io.*;
import java.net.*;
import java.util.*;

class URLConnectionData {
	
	public static void main(String[] args) throws IOException {

		URL obj = new URL("www.core2web.in");

		URLConnection con = obj.openConnection();
		System.out.println("Last Modified : " + new Date(con.getLastModified()));
	}
}
