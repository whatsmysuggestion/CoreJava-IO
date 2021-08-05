import java.io.*;
public class FileReaderExample {

	public static void main(String[] args) throws Exception {

		int c;
		FileReader fr=new FileReader("E:\\dummy\\demo.txt");
		
		while((c=fr.read())!=-1)
		{
			System.out.println((char)c);
		}
		
		fr.close();
		

	}

}



