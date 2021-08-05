import java.io.*;

public class FileClassExample {
	public static void main(String[] args) {	 
		
		File f=new File("E:\\dummy\\demo.txt");
		
		System.out.println(f.getName());
		System.out.println(f.getParent());
		
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		System.out.println(f.isHidden());
		
		System.out.println(f.exists());
		
		System.out.println(f.canRead());
		
		System.out.println(f.canWrite());
		
		System.out.println(f.length());
		
		System.out.println(f.lastModified());
	 	}
}
