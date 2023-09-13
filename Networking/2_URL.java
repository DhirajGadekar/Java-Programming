// URL :

import java.io.*;
import java.net.*;

class URLMetaData {
	
	public static void main(String[] args) throws MalformedURLException {
		
		URL obj = new URL("https://www.youtube.com:8080/watch?v=XFm-P416Fbo&list=RDXFm-P416Fbo&start_radio=1");

		// 1) public java.lang.String getProtocol();
		System.out.println(obj.getProtocol());
		
		// 2) public java.lang.String getQuery();
		System.out.println(obj.getQuery());
		
		// 3) public java.lang.String getPath();
		System.out.println(obj.getPath());
		
		// 4) public java.lang.String getUserInfo();
		System.out.println(obj.getUserInfo());
		
		// 5) public java.lang.String getAuthority();
		System.out.println(obj.getAuthority());
	       	
		// 6) public int getPort();
		System.out.println(obj.getPort());
		
		// 7) public int getDefaultPort();
		System.out.println(obj.getDefaultPort());
  		
		// 8) public java.lang.String getHost();
		System.out.println(obj.getHost());	

		// 9) public java.lang.String getFile();
		System.out.println(obj.getFile());
		
		// 10) public java.lang.String getRef();
		System.out.println(obj.getRef());
	}
}
