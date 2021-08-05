import java.io.*;
public class FileClassExample1 {

	public static void main(String[] args)throws Exception {
		
		
		
		/*
		 * File f=new File("E:\\dummy");
		 * 
		 * File ff[]=f.listFiles();
		 * 
		 * for(int i=0;i<ff.length;i++) System.out.println(ff[i]);
		 */
			
		/*
		 * File f2=new File("E:\\dummy\\sajib"); if(f2.mkdir())
		 * System.out.println("Folder Created"); else
		 * System.out.println("Could not Create Folder");
		 */
		
		
		/*
		 * File f3=new File("E:\\dummy\\sajib1.txt");
		 * 
		 * if(f3.createNewFile()) System.out.println("File Created"); else
		 * System.out.println("Could not Create File");
		 * 
		 */
		
		
		  File f4=new File("E:\\dummy\\sajib1.txt");
		  f4.delete();
		  f4.deleteOnExit();
		 
		 
		  
		 
		  
		 
		 
		 
		 

	} 

}
