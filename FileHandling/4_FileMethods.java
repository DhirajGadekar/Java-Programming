import java.io.*;

class FileHandling {
	
	public static void main(String[] args) throws IOException {
		
		File dir = new File("Core2Web");

		// 1) public boolean mkdir();
		dir.mkdir();

		File file = new File(dir, "Code.txt");

		// 2) public boolean createNewFile() throws java.io.IOException;
		file.createNewFile();

		// 3) public java.lang.String getName();
		System.out.println(file.getName());

		// 4) public java.lang.String getParent();
		System.out.println(file.getParent());

		// 5) public java.lang.String getPath();
		System.out.println(file.getPath());

		// 6) public boolean isAbsolute();
		System.out.println(file.isAbsolute());
		
		// 7) public java.lang.String getAbsolutePath();
		System.out.println(file.getAbsolutePath());

		// 8) public int compareTo(java.io.File);	
		System.out.println(dir.compareTo(file));

		// 9) public boolean canWrite();
		System.out.println(file.canWrite());
		System.out.println(dir.canWrite());

		// 10) public boolean exists();
		System.out.println(file.exists());

		// 11) public boolean isDirectory();
		System.out.println(file.isDirectory());
		System.out.println(dir.isDirectory());

		// 12) public boolean isFile();
		System.out.println(file.isFile());
		System.out.println(dir.isFile());

		// 13) public boolean isHidden();
		System.out.println(file.isHidden());
		System.out.println(dir.isHidden());

		// 14) public long lastModified();	
		System.out.println(file.lastModified());
		System.out.println(dir.lastModified());

		// 15) public boolean canRead();
		System.out.println(file.canRead());
		System.out.println(dir.canRead());

		// 16) public long length();
		System.out.println(file.length());
		System.out.println(dir.length());
		
		// 17) public boolean delete();
		System.out.println(file.delete());
		System.out.println(file.exists());
	}

}
