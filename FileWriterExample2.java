import java.io.*;
public class FileWriterExample2 {

	public static void main(String[] args) throws Exception {	
		
		FileWriter fw=new FileWriter("E:\\dummy\\sajib.txt",true);
	 
		fw.write('f');
		 
		fw.close();
		
		 
	}

}
