// OpenWebSite : 

import java.io.*;
import java.awt.*;
import java.net.*;

class OpenWebSite {
	
	public static void main(String[] args) throws URISyntaxException, IOException {
		
		URI obj = new URI("https://www.youtube.com/watch?v=oH31k5Ib29c&list=RDXFm-P416Fbo&index=2");

		Desktop desk = Desktop.getDesktop();
		desk.browse(obj);
	}
}
